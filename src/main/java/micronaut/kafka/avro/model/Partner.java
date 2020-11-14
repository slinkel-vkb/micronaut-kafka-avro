/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package micronaut.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Partner is Kunden von VKB, kann sowohl juristische Person als auch natuerliche Person sein */
@org.apache.avro.specific.AvroGenerated
public class Partner extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2627508177165081017L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Partner\",\"namespace\":\"micronaut.kafka.avro.model\",\"doc\":\"Partner is Kunden von VKB, kann sowohl juristische Person als auch natuerliche Person sein\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"Partner ID\"},{\"name\":\"vorname\",\"type\":\"string\",\"doc\":\"Vorname des Partners\"},{\"name\":\"nachname\",\"type\":\"string\",\"doc\":\"Nachname des Partners\"},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"doc\":\"Email des Partners\",\"default\":null}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Partner> ENCODER =
      new BinaryMessageEncoder<Partner>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Partner> DECODER =
      new BinaryMessageDecoder<Partner>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Partner> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Partner> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Partner> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Partner>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Partner to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Partner from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Partner instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Partner fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Partner ID */
   private java.lang.CharSequence id;
  /** Vorname des Partners */
   private java.lang.CharSequence vorname;
  /** Nachname des Partners */
   private java.lang.CharSequence nachname;
  /** Email des Partners */
   private java.lang.CharSequence email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Partner() {}

  /**
   * All-args constructor.
   * @param id Partner ID
   * @param vorname Vorname des Partners
   * @param nachname Nachname des Partners
   * @param email Email des Partners
   */
  public Partner(java.lang.CharSequence id, java.lang.CharSequence vorname, java.lang.CharSequence nachname, java.lang.CharSequence email) {
    this.id = id;
    this.vorname = vorname;
    this.nachname = nachname;
    this.email = email;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return vorname;
    case 2: return nachname;
    case 3: return email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: vorname = (java.lang.CharSequence)value$; break;
    case 2: nachname = (java.lang.CharSequence)value$; break;
    case 3: email = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return Partner ID
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * Partner ID
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'vorname' field.
   * @return Vorname des Partners
   */
  public java.lang.CharSequence getVorname() {
    return vorname;
  }


  /**
   * Sets the value of the 'vorname' field.
   * Vorname des Partners
   * @param value the value to set.
   */
  public void setVorname(java.lang.CharSequence value) {
    this.vorname = value;
  }

  /**
   * Gets the value of the 'nachname' field.
   * @return Nachname des Partners
   */
  public java.lang.CharSequence getNachname() {
    return nachname;
  }


  /**
   * Sets the value of the 'nachname' field.
   * Nachname des Partners
   * @param value the value to set.
   */
  public void setNachname(java.lang.CharSequence value) {
    this.nachname = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return Email des Partners
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * Email des Partners
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Creates a new Partner RecordBuilder.
   * @return A new Partner RecordBuilder
   */
  public static micronaut.kafka.avro.model.Partner.Builder newBuilder() {
    return new micronaut.kafka.avro.model.Partner.Builder();
  }

  /**
   * Creates a new Partner RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Partner RecordBuilder
   */
  public static micronaut.kafka.avro.model.Partner.Builder newBuilder(micronaut.kafka.avro.model.Partner.Builder other) {
    if (other == null) {
      return new micronaut.kafka.avro.model.Partner.Builder();
    } else {
      return new micronaut.kafka.avro.model.Partner.Builder(other);
    }
  }

  /**
   * Creates a new Partner RecordBuilder by copying an existing Partner instance.
   * @param other The existing instance to copy.
   * @return A new Partner RecordBuilder
   */
  public static micronaut.kafka.avro.model.Partner.Builder newBuilder(micronaut.kafka.avro.model.Partner other) {
    if (other == null) {
      return new micronaut.kafka.avro.model.Partner.Builder();
    } else {
      return new micronaut.kafka.avro.model.Partner.Builder(other);
    }
  }

  /**
   * RecordBuilder for Partner instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Partner>
    implements org.apache.avro.data.RecordBuilder<Partner> {

    /** Partner ID */
    private java.lang.CharSequence id;
    /** Vorname des Partners */
    private java.lang.CharSequence vorname;
    /** Nachname des Partners */
    private java.lang.CharSequence nachname;
    /** Email des Partners */
    private java.lang.CharSequence email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(micronaut.kafka.avro.model.Partner.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.vorname)) {
        this.vorname = data().deepCopy(fields()[1].schema(), other.vorname);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.nachname)) {
        this.nachname = data().deepCopy(fields()[2].schema(), other.nachname);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Partner instance
     * @param other The existing instance to copy.
     */
    private Builder(micronaut.kafka.avro.model.Partner other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vorname)) {
        this.vorname = data().deepCopy(fields()[1].schema(), other.vorname);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nachname)) {
        this.nachname = data().deepCopy(fields()[2].schema(), other.nachname);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * Partner ID
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * Partner ID
      * @param value The value of 'id'.
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * Partner ID
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * Partner ID
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'vorname' field.
      * Vorname des Partners
      * @return The value.
      */
    public java.lang.CharSequence getVorname() {
      return vorname;
    }


    /**
      * Sets the value of the 'vorname' field.
      * Vorname des Partners
      * @param value The value of 'vorname'.
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder setVorname(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.vorname = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vorname' field has been set.
      * Vorname des Partners
      * @return True if the 'vorname' field has been set, false otherwise.
      */
    public boolean hasVorname() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'vorname' field.
      * Vorname des Partners
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder clearVorname() {
      vorname = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'nachname' field.
      * Nachname des Partners
      * @return The value.
      */
    public java.lang.CharSequence getNachname() {
      return nachname;
    }


    /**
      * Sets the value of the 'nachname' field.
      * Nachname des Partners
      * @param value The value of 'nachname'.
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder setNachname(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.nachname = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'nachname' field has been set.
      * Nachname des Partners
      * @return True if the 'nachname' field has been set, false otherwise.
      */
    public boolean hasNachname() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'nachname' field.
      * Nachname des Partners
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder clearNachname() {
      nachname = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * Email des Partners
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * Email des Partners
      * @param value The value of 'email'.
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.email = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * Email des Partners
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'email' field.
      * Email des Partners
      * @return This builder.
      */
    public micronaut.kafka.avro.model.Partner.Builder clearEmail() {
      email = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Partner build() {
      try {
        Partner record = new Partner();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.vorname = fieldSetFlags()[1] ? this.vorname : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.nachname = fieldSetFlags()[2] ? this.nachname : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.email = fieldSetFlags()[3] ? this.email : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Partner>
    WRITER$ = (org.apache.avro.io.DatumWriter<Partner>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Partner>
    READER$ = (org.apache.avro.io.DatumReader<Partner>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    out.writeString(this.vorname);

    out.writeString(this.nachname);

    if (this.email == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.email);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.vorname = in.readString(this.vorname instanceof Utf8 ? (Utf8)this.vorname : null);

      this.nachname = in.readString(this.nachname instanceof Utf8 ? (Utf8)this.nachname : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.email = null;
      } else {
        this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          this.vorname = in.readString(this.vorname instanceof Utf8 ? (Utf8)this.vorname : null);
          break;

        case 2:
          this.nachname = in.readString(this.nachname instanceof Utf8 ? (Utf8)this.nachname : null);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email = null;
          } else {
            this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










