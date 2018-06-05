import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsulterPrixComponent } from './consulter-prix.component';

describe('ConsulterPrixComponent', () => {
  let component: ConsulterPrixComponent;
  let fixture: ComponentFixture<ConsulterPrixComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsulterPrixComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsulterPrixComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
