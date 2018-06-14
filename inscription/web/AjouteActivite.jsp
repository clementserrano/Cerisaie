<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="Header.jsp" %>
<script language="Javascript" type="text/javascript"></script>
<script type="text/javascript" src="resources/js/foncControle.js"></script>
<script>
    function Chargement() {
        var obj = document.getElementById("id_erreur");
        if (obj.value != '')
            alert('Erreur signalée  : "' + obj.value + "'");
    }
</script>
<script src="js/js_verif.js" type="text/javascript"></script>

<form id="formAddActivitie" action='Controleur?action=ENVOI_ACTIVITE' method='post' onsubmit="return verif($('#formAddActivitie'));">
    <div>
        <div class="container">
            <div class="well">

                <h1>Ajouter une activité</h1>
                <div class="form-group">
                    <label for="codeSport">Code Sport</label>
                    <input type="number" class="form-control" id="codeSport" name="codeSport">
                </div>

                <div class="form-group">
                    <label for="libelle">Libellé</label>
                    <input type="text" class="form-control" id="libelle" name="libelle">
                </div>
                <div class="form-group">
                    <label for="dateJour">Date Jour</label>
                    <input name="dateJour" id="dateJour" class="form-control" min="0">
                </div>
                <script>$("#dateJour").datepicker();</script>
                <div class="form-group">
                    <label for="numSej">Numéro de séjour</label>
                    <input type="number" class="form-control" id="numSej" name="numSej">
                </div>
                <div class="form-group">
                    <label for="nbLoc">Nombre d'unités</label>
                    <input type="number" class="form-control" id="nbLoc" name="nbLoc">
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-default btn-primary"><span
                            class="glyphicon glyphicon-ok"></span>
                        Valider
                    </button>
                    <button type="button" class="btn btn-default btn-primary"
                            onclick="{ window.location = 'index.jsp'; }">
                        <span class="glyphicon glyphicon-remove"></span> Annuler
                    </button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
