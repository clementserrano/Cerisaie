import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanningActiviteComponent } from './planning-activite.component';

describe('PlanningActiviteComponent', () => {
  let component: PlanningActiviteComponent;
  let fixture: ComponentFixture<PlanningActiviteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlanningActiviteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlanningActiviteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
