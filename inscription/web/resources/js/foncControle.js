function verif(form)
{
    var x = form[0];
    var errorMessage = "";
    var i;
    var isDateValid =true;
    for (i = 0; i < 5 ;i++) {
        if (i==0 && x.elements[i].value == "") {
            errorMessage+="Veuillez rentrer : \n"
        }
        if (x.elements[i].value == "") {
            switch (x.elements[i].name){
                case "codeSport" : errorMessage += " - un numéro de sport" ;
                    break;
                case "libelle" : errorMessage += " - un libellé";
                    break;
                case "dateJour" : errorMessage += " - une date";
                    break;
                case "numSej" : errorMessage += " - un numéro de séjour";
                    break;
                case "nbLoc" : errorMessage += " - un nombre d'unités";
                    break;

            }
            errorMessage+= " \n"
        }
        if (x.elements[i].name =="dateJour" && x.elements[i].value != "" ) {
            isDateValid = isValidDate(x.elements[i].value);
        }
    }

    if (!isDateValid) {
        errorMessage += "\nVeuillez rentrer une date avec un format valide (mm/jj/aaaa)";
    }
    if (errorMessage != "") {
        alert(errorMessage);
        return false;
    } else {
        return true;
    }

}

function isValidDate(dateString)
{
    // First check for the pattern
    if(!/^\d{1,2}\/\d{1,2}\/\d{4}$/.test(dateString))
        return false;

    // Parse the date parts to integers
    var parts = dateString.split("/");
    var day = parseInt(parts[1], 10);
    var month = parseInt(parts[0], 10);
    var year = parseInt(parts[2], 10);

    // Check the ranges of month and year
    if(year < 1000 || year > 3000 || month == 0 || month > 12)
        return false;

    var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];

    // Adjust for leap years
    if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
        monthLength[1] = 29;

    // Check the range of the day
    return day > 0 && day <= monthLength[month - 1];
};