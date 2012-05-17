package com.github.aselab.activerecord

trait Annotations {
  import annotation.target._

  type Column = org.squeryl.annotations.Column

  type OptionType = org.squeryl.annotations.OptionType

  type Transient = org.squeryl.annotations.Transient

  /**
   * ignore field annotation.
   */
  type Ignore = annotations.Ignore @field

  /**
   * unique field annotation.
   */
  type Unique = annotations.Unique @field

  type Required = annotations.Required @field

  type Length = annotations.Length @field

  type Range = annotations.Range @field

  type Checked = annotations.Checked @field

  type Email = annotations.Email @field
}
