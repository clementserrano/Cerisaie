import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifieOeuvreComponent } from './modifie-oeuvre.component';

describe('ModifieOeuvreComponent', () => {
  let component: ModifieOeuvreComponent;
  let fixture: ComponentFixture<ModifieOeuvreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifieOeuvreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifieOeuvreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
