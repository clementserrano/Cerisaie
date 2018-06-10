import { TestBed, inject } from '@angular/core/testing';

import { PrixService } from './prix.service';

describe('PrixService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PrixService]
    });
  });

  it('should be created', inject([PrixService], (service: PrixService) => {
    expect(service).toBeTruthy();
  }));
});
