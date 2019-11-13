// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReplyBody.proto

package com.farsunset.cim.sdk.android.model.proto;

public final class ReplyBodyProto {
  private ReplyBodyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.farsunset.cim.sdk.android.model.proto.Model)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string key = 1;</code>
     */
    java.lang.String getKey();
    /**
     * <code>optional string key = 1;</code>
     */
    com.google.protobuf.ByteString
        getKeyBytes();

    /**
     * <code>optional string code = 2;</code>
     */
    java.lang.String getCode();
    /**
     * <code>optional string code = 2;</code>
     */
    com.google.protobuf.ByteString
        getCodeBytes();

    /**
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional int64 timestamp = 4;</code>
     */
    long getTimestamp();

    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */
    int getDataCount();
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */
    boolean containsData(
        java.lang.String key);
    /**
     * Use {@link #getDataMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String>
    getData();
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */
    java.util.Map<java.lang.String, java.lang.String>
    getDataMap();
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    java.lang.String getDataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    java.lang.String getDataOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code com.farsunset.cim.sdk.android.model.proto.Model}
   */
  public  static final class Model extends
      com.google.protobuf.GeneratedMessageLite<
          Model, Model.Builder> implements
      // @@protoc_insertion_point(message_implements:com.farsunset.cim.sdk.android.model.proto.Model)
      ModelOrBuilder {
    private Model() {
      key_ = "";
      code_ = "";
      message_ = "";
    }
    private int bitField0_;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.String key_;
    /**
     * <code>optional string key = 1;</code>
     */
    public java.lang.String getKey() {
      return key_;
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(key_);
    }
    /**
     * <code>optional string key = 1;</code>
     */
    private void setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
    }
    /**
     * <code>optional string key = 1;</code>
     */
    private void clearKey() {
      
      key_ = getDefaultInstance().getKey();
    }
    /**
     * <code>optional string key = 1;</code>
     */
    private void setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value.toStringUtf8();
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private java.lang.String code_;
    /**
     * <code>optional string code = 2;</code>
     */
    public java.lang.String getCode() {
      return code_;
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(code_);
    }
    /**
     * <code>optional string code = 2;</code>
     */
    private void setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
    }
    /**
     * <code>optional string code = 2;</code>
     */
    private void clearCode() {
      
      code_ = getDefaultInstance().getCode();
    }
    /**
     * <code>optional string code = 2;</code>
     */
    private void setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value.toStringUtf8();
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.String message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      return message_;
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(message_);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    private void setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
    }
    /**
     * <code>optional string message = 3;</code>
     */
    private void clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
    }
    /**
     * <code>optional string message = 3;</code>
     */
    private void setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value.toStringUtf8();
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private long timestamp_;
    /**
     * <code>optional int64 timestamp = 4;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>optional int64 timestamp = 4;</code>
     */
    private void setTimestamp(long value) {
      
      timestamp_ = value;
    }
    /**
     * <code>optional int64 timestamp = 4;</code>
     */
    private void clearTimestamp() {
      
      timestamp_ = 0L;
    }

    public static final int DATA_FIELD_NUMBER = 5;
    private static final class DataDefaultEntryHolder {
      static final com.google.protobuf.MapEntryLite<
          java.lang.String, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntryLite
              .<java.lang.String, java.lang.String>newDefaultInstance(
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapFieldLite<
        java.lang.String, java.lang.String> data_ =
            com.google.protobuf.MapFieldLite.emptyMapField();
    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
    internalGetData() {
      return data_;
    }
    private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
    internalGetMutableData() {
      if (!data_.isMutable()) {
        data_ = data_.mutableCopy();
      }
      return data_;
    }

    public int getDataCount() {
      return internalGetData().size();
    }
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    public boolean containsData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetData().containsKey(key);
    }
    /**
     * Use {@link #getDataMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getData() {
      return getDataMap();
    }
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
      return java.util.Collections.unmodifiableMap(
          internalGetData());
    }
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    public java.lang.String getDataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetData();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */

    public java.lang.String getDataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetData();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <code>map&lt;string, string&gt; data = 5;</code>
     */
    private java.util.Map<java.lang.String, java.lang.String>
    getMutableDataMap() {
      return internalGetMutableData();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!key_.isEmpty()) {
        output.writeString(1, getKey());
      }
      if (!code_.isEmpty()) {
        output.writeString(2, getCode());
      }
      if (!message_.isEmpty()) {
        output.writeString(3, getMessage());
      }
      if (timestamp_ != 0L) {
        output.writeInt64(4, timestamp_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetData().entrySet()) {
        DataDefaultEntryHolder.defaultEntry.serializeTo(
            output, 5, entry.getKey(), entry.getValue());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getKey());
      }
      if (!code_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getCode());
      }
      if (!message_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getMessage());
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, timestamp_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetData().entrySet()) {
        size += DataDefaultEntryHolder.defaultEntry.computeMessageSize(
          5, entry.getKey(), entry.getValue());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code com.farsunset.cim.sdk.android.model.proto.Model}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.farsunset.cim.sdk.android.model.proto.Model)
        com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.ModelOrBuilder {
      // Construct using com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string key = 1;</code>
       */
      public java.lang.String getKey() {
        return instance.getKey();
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public com.google.protobuf.ByteString
          getKeyBytes() {
        return instance.getKeyBytes();
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder setKey(
          java.lang.String value) {
        copyOnWrite();
        instance.setKey(value);
        return this;
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder clearKey() {
        copyOnWrite();
        instance.clearKey();
        return this;
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder setKeyBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setKeyBytes(value);
        return this;
      }

      /**
       * <code>optional string code = 2;</code>
       */
      public java.lang.String getCode() {
        return instance.getCode();
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        return instance.getCodeBytes();
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder setCode(
          java.lang.String value) {
        copyOnWrite();
        instance.setCode(value);
        return this;
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder clearCode() {
        copyOnWrite();
        instance.clearCode();
        return this;
      }
      /**
       * <code>optional string code = 2;</code>
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCodeBytes(value);
        return this;
      }

      /**
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        return instance.getMessage();
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        return instance.getMessageBytes();
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        copyOnWrite();
        instance.setMessage(value);
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        copyOnWrite();
        instance.clearMessage();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setMessageBytes(value);
        return this;
      }

      /**
       * <code>optional int64 timestamp = 4;</code>
       */
      public long getTimestamp() {
        return instance.getTimestamp();
      }
      /**
       * <code>optional int64 timestamp = 4;</code>
       */
      public Builder setTimestamp(long value) {
        copyOnWrite();
        instance.setTimestamp(value);
        return this;
      }
      /**
       * <code>optional int64 timestamp = 4;</code>
       */
      public Builder clearTimestamp() {
        copyOnWrite();
        instance.clearTimestamp();
        return this;
      }


      public int getDataCount() {
        return instance.getDataMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */

      public boolean containsData(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return instance.getDataMap().containsKey(key);
      }

      public Builder clearData() {
        copyOnWrite();
        instance.getMutableDataMap().clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */

      public Builder removeData(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        copyOnWrite();
        instance.getMutableDataMap().remove(key);
        return this;
      }
      /**
       * Use {@link #getDataMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getData() {
        return getDataMap();
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
        return java.util.Collections.unmodifiableMap(
            instance.getDataMap());
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */

      public java.lang.String getDataOrDefault(
          java.lang.String key,
          java.lang.String defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            instance.getDataMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */

      public java.lang.String getDataOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            instance.getDataMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */
      public Builder putData(
          java.lang.String key,
          java.lang.String value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        copyOnWrite();
        instance.getMutableDataMap().put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; data = 5;</code>
       */
      public Builder putAllData(
          java.util.Map<java.lang.String, java.lang.String> values) {
        copyOnWrite();
        instance.getMutableDataMap().putAll(values);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.farsunset.cim.sdk.android.model.proto.Model)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          data_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model other = (com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model) arg1;
          key_ = visitor.visitString(!key_.isEmpty(), key_,
              !other.key_.isEmpty(), other.key_);
          code_ = visitor.visitString(!code_.isEmpty(), code_,
              !other.code_.isEmpty(), other.code_);
          message_ = visitor.visitString(!message_.isEmpty(), message_,
              !other.message_.isEmpty(), other.message_);
          timestamp_ = visitor.visitLong(timestamp_ != 0L, timestamp_,
              other.timestamp_ != 0L, other.timestamp_);
          data_ = visitor.visitMap(
              data_, other.internalGetData());
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  key_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  code_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  message_ = s;
                  break;
                }
                case 32: {

                  timestamp_ = input.readInt64();
                  break;
                }
                case 42: {
                  if (!data_.isMutable()) {
                    data_ = data_.mutableCopy();
                  }
                  DataDefaultEntryHolder.defaultEntry.parseInto(data_, input, extensionRegistry);  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.farsunset.cim.sdk.android.model.proto.Model)
    private static final com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Model();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.farsunset.cim.sdk.android.model.proto.ReplyBodyProto.Model getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Model> PARSER;

    public static com.google.protobuf.Parser<Model> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
