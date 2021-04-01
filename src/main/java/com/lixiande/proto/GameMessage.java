// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/msg.proto

package com.lixiande.proto;

public final class GameMessage {
  private GameMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.lixiande.proto.Info)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 port = 1;</code>
     * @return Whether the port field is set.
     */
    boolean hasPort();
    /**
     * <code>int32 port = 1;</code>
     * @return The port.
     */
    int getPort();

    /**
     * <code>string info = 2;</code>
     * @return Whether the info field is set.
     */
    boolean hasInfo();
    /**
     * <code>string info = 2;</code>
     * @return The info.
     */
    java.lang.String getInfo();
    /**
     * <code>string info = 2;</code>
     * @return The bytes for info.
     */
    com.google.protobuf.ByteString
        getInfoBytes();
  }
  /**
   * Protobuf type {@code com.lixiande.proto.Info}
   */
  public static final class Info extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.lixiande.proto.Info)
      InfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Info.newBuilder() to construct.
    private Info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Info() {
      info_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Info();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Info(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              port_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              info_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lixiande.proto.GameMessage.internal_static_com_lixiande_proto_Info_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lixiande.proto.GameMessage.internal_static_com_lixiande_proto_Info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lixiande.proto.GameMessage.Info.class, com.lixiande.proto.GameMessage.Info.Builder.class);
    }

    private int bitField0_;
    public static final int PORT_FIELD_NUMBER = 1;
    private int port_;
    /**
     * <code>int32 port = 1;</code>
     * @return Whether the port field is set.
     */
    @java.lang.Override
    public boolean hasPort() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>int32 port = 1;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    public static final int INFO_FIELD_NUMBER = 2;
    private volatile java.lang.Object info_;
    /**
     * <code>string info = 2;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>string info = 2;</code>
     * @return The info.
     */
    @java.lang.Override
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      }
    }
    /**
     * <code>string info = 2;</code>
     * @return The bytes for info.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, port_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, info_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, port_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, info_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.lixiande.proto.GameMessage.Info)) {
        return super.equals(obj);
      }
      com.lixiande.proto.GameMessage.Info other = (com.lixiande.proto.GameMessage.Info) obj;

      if (hasPort() != other.hasPort()) return false;
      if (hasPort()) {
        if (getPort()
            != other.getPort()) return false;
      }
      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort();
      }
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lixiande.proto.GameMessage.Info parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lixiande.proto.GameMessage.Info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.lixiande.proto.GameMessage.Info parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lixiande.proto.GameMessage.Info parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.lixiande.proto.GameMessage.Info prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.lixiande.proto.Info}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.lixiande.proto.Info)
        com.lixiande.proto.GameMessage.InfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lixiande.proto.GameMessage.internal_static_com_lixiande_proto_Info_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lixiande.proto.GameMessage.internal_static_com_lixiande_proto_Info_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lixiande.proto.GameMessage.Info.class, com.lixiande.proto.GameMessage.Info.Builder.class);
      }

      // Construct using com.lixiande.proto.GameMessage.Info.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        info_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lixiande.proto.GameMessage.internal_static_com_lixiande_proto_Info_descriptor;
      }

      @java.lang.Override
      public com.lixiande.proto.GameMessage.Info getDefaultInstanceForType() {
        return com.lixiande.proto.GameMessage.Info.getDefaultInstance();
      }

      @java.lang.Override
      public com.lixiande.proto.GameMessage.Info build() {
        com.lixiande.proto.GameMessage.Info result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lixiande.proto.GameMessage.Info buildPartial() {
        com.lixiande.proto.GameMessage.Info result = new com.lixiande.proto.GameMessage.Info(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.port_ = port_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.info_ = info_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lixiande.proto.GameMessage.Info) {
          return mergeFrom((com.lixiande.proto.GameMessage.Info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lixiande.proto.GameMessage.Info other) {
        if (other == com.lixiande.proto.GameMessage.Info.getDefaultInstance()) return this;
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasInfo()) {
          bitField0_ |= 0x00000002;
          info_ = other.info_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.lixiande.proto.GameMessage.Info parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lixiande.proto.GameMessage.Info) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int port_ ;
      /**
       * <code>int32 port = 1;</code>
       * @return Whether the port field is set.
       */
      @java.lang.Override
      public boolean hasPort() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>int32 port = 1;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <code>int32 port = 1;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000001;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 port = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000001);
        port_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object info_ = "";
      /**
       * <code>string info = 2;</code>
       * @return Whether the info field is set.
       */
      public boolean hasInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>string info = 2;</code>
       * @return The info.
       */
      public java.lang.String getInfo() {
        java.lang.Object ref = info_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          info_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string info = 2;</code>
       * @return The bytes for info.
       */
      public com.google.protobuf.ByteString
          getInfoBytes() {
        java.lang.Object ref = info_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          info_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string info = 2;</code>
       * @param value The info to set.
       * @return This builder for chaining.
       */
      public Builder setInfo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        info_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string info = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        info_ = getDefaultInstance().getInfo();
        onChanged();
        return this;
      }
      /**
       * <code>string info = 2;</code>
       * @param value The bytes for info to set.
       * @return This builder for chaining.
       */
      public Builder setInfoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        bitField0_ |= 0x00000002;
        info_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.lixiande.proto.Info)
    }

    // @@protoc_insertion_point(class_scope:com.lixiande.proto.Info)
    private static final com.lixiande.proto.GameMessage.Info DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lixiande.proto.GameMessage.Info();
    }

    public static com.lixiande.proto.GameMessage.Info getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Info>
        PARSER = new com.google.protobuf.AbstractParser<Info>() {
      @java.lang.Override
      public Info parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Info(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Info> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Info> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lixiande.proto.GameMessage.Info getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lixiande_proto_Info_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lixiande_proto_Info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023resources/msg.proto\022\022com.lixiande.prot" +
      "o\">\n\004Info\022\021\n\004port\030\001 \001(\005H\000\210\001\001\022\021\n\004info\030\002 \001" +
      "(\tH\001\210\001\001B\007\n\005_portB\007\n\005_infoB!\n\022com.lixiand" +
      "e.protoB\013GameMessageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_lixiande_proto_Info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_lixiande_proto_Info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lixiande_proto_Info_descriptor,
        new java.lang.String[] { "Port", "Info", "Port", "Info", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
