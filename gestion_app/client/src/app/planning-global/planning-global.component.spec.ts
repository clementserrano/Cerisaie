import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanningGlobalComponent } from './planning-global.component';

describe('PlanningGlobalComponent', () => {
  let component: PlanningGlobalComponent;
  let fixture: ComponentFixture<PlanningGlobalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlanningGlobalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlanningGlobalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
