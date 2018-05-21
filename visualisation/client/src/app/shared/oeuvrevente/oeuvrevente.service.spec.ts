import { TestBed, inject } from '@angular/core/testing';

import { OeuvreventeService } from './oeuvrevente.service';

describe('OeuvreventeService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [OeuvreventeService]
    });
  });

  it('should be created', inject([OeuvreventeService], (service: OeuvreventeService) => {
    expect(service).toBeTruthy();
  }));
});
