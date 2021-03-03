import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountVetrinaComponent } from './account-vetrina.component';

describe('AccountVetrinaComponent', () => {
  let component: AccountVetrinaComponent;
  let fixture: ComponentFixture<AccountVetrinaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccountVetrinaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AccountVetrinaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
