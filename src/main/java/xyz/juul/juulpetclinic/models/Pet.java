package xyz.juul.juulpetclinic.models;

import java.time.LocalDate;

public class Pet
{
  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;

  public PetType getPetType()
  {
    return petType;
  }

  public void setPetType(PetType _petType)
  {
    petType = _petType;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public void setOwner(Owner _owner)
  {
    owner = _owner;
  }

  public LocalDate getBirthDate()
  {
    return birthDate;
  }

  public void setBirthDate(LocalDate _birthDate)
  {
    birthDate = _birthDate;
  }
}
