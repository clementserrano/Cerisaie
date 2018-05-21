import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReserveOeuvreComponent } from './reserve-oeuvre.component';

describe('ReserveOeuvreComponent', () => {
  let component: ReserveOeuvreComponent;
  let fixture: ComponentFixture<ReserveOeuvreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReserveOeuvreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReserveOeuvreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
