import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectionActiviteComponent } from './selection-activite.component';

describe('SelectionActiviteComponent', () => {
  let component: SelectionActiviteComponent;
  let fixture: ComponentFixture<SelectionActiviteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelectionActiviteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SelectionActiviteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
