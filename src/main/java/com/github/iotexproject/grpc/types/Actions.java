// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * a pack of actions
 * </pre>
 *
 * Protobuf type {@code iotextypes.Actions}
 */
public final class Actions extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.Actions)
    ActionsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      Actions.class.getName());
  }
  // Use Actions.newBuilder() to construct.
  private Actions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Actions() {
    actions_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_Actions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_Actions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.Actions.class, com.github.iotexproject.grpc.types.Actions.Builder.class);
  }

  public static final int ACTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.github.iotexproject.grpc.types.Action> actions_;
  /**
   * <code>repeated .iotextypes.Action actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.Action> getActionsList() {
    return actions_;
  }
  /**
   * <code>repeated .iotextypes.Action actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.ActionOrBuilder> 
      getActionsOrBuilderList() {
    return actions_;
  }
  /**
   * <code>repeated .iotextypes.Action actions = 1;</code>
   */
  @java.lang.Override
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   * <code>repeated .iotextypes.Action actions = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Action getActions(int index) {
    return actions_.get(index);
  }
  /**
   * <code>repeated .iotextypes.Action actions = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.ActionOrBuilder getActionsOrBuilder(
      int index) {
    return actions_.get(index);
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
    for (int i = 0; i < actions_.size(); i++) {
      output.writeMessage(1, actions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < actions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, actions_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.iotexproject.grpc.types.Actions)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.Actions other = (com.github.iotexproject.grpc.types.Actions) obj;

    if (!getActionsList()
        .equals(other.getActionsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.Actions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.Actions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.Actions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.iotexproject.grpc.types.Actions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * a pack of actions
   * </pre>
   *
   * Protobuf type {@code iotextypes.Actions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.Actions)
      com.github.iotexproject.grpc.types.ActionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_Actions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_Actions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.Actions.class, com.github.iotexproject.grpc.types.Actions.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.Actions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
      } else {
        actions_ = null;
        actionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_Actions_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Actions getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.Actions.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Actions build() {
      com.github.iotexproject.grpc.types.Actions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Actions buildPartial() {
      com.github.iotexproject.grpc.types.Actions result = new com.github.iotexproject.grpc.types.Actions(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.github.iotexproject.grpc.types.Actions result) {
      if (actionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          actions_ = java.util.Collections.unmodifiableList(actions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.actions_ = actions_;
      } else {
        result.actions_ = actionsBuilder_.build();
      }
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.Actions result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.Actions) {
        return mergeFrom((com.github.iotexproject.grpc.types.Actions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.Actions other) {
      if (other == com.github.iotexproject.grpc.types.Actions.getDefaultInstance()) return this;
      if (actionsBuilder_ == null) {
        if (!other.actions_.isEmpty()) {
          if (actions_.isEmpty()) {
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActionsIsMutable();
            actions_.addAll(other.actions_);
          }
          onChanged();
        }
      } else {
        if (!other.actions_.isEmpty()) {
          if (actionsBuilder_.isEmpty()) {
            actionsBuilder_.dispose();
            actionsBuilder_ = null;
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            actionsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getActionsFieldBuilder() : null;
          } else {
            actionsBuilder_.addAllMessages(other.actions_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.github.iotexproject.grpc.types.Action m =
                  input.readMessage(
                      com.github.iotexproject.grpc.types.Action.parser(),
                      extensionRegistry);
              if (actionsBuilder_ == null) {
                ensureActionsIsMutable();
                actions_.add(m);
              } else {
                actionsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.iotexproject.grpc.types.Action> actions_ =
      java.util.Collections.emptyList();
    private void ensureActionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        actions_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Action>(actions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder> actionsBuilder_;

    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Action> getActionsList() {
      if (actionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actions_);
      } else {
        return actionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public int getActionsCount() {
      if (actionsBuilder_ == null) {
        return actions_.size();
      } else {
        return actionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Action getActions(int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);
      } else {
        return actionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder setActions(
        int index, com.github.iotexproject.grpc.types.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.set(index, value);
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder setActions(
        int index, com.github.iotexproject.grpc.types.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.set(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder addActions(com.github.iotexproject.grpc.types.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder addActions(
        int index, com.github.iotexproject.grpc.types.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(index, value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder addActions(
        com.github.iotexproject.grpc.types.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder addActions(
        int index, com.github.iotexproject.grpc.types.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder addAllActions(
        java.lang.Iterable<? extends com.github.iotexproject.grpc.types.Action> values) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, actions_);
        onChanged();
      } else {
        actionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder clearActions() {
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public Builder removeActions(int index) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.remove(index);
        onChanged();
      } else {
        actionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Action.Builder getActionsBuilder(
        int index) {
      return getActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public com.github.iotexproject.grpc.types.ActionOrBuilder getActionsOrBuilder(
        int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);  } else {
        return actionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public java.util.List<? extends com.github.iotexproject.grpc.types.ActionOrBuilder> 
         getActionsOrBuilderList() {
      if (actionsBuilder_ != null) {
        return actionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actions_);
      }
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Action.Builder addActionsBuilder() {
      return getActionsFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.Action.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Action.Builder addActionsBuilder(
        int index) {
      return getActionsFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.Action.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Action actions = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Action.Builder> 
         getActionsBuilderList() {
      return getActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder> 
        getActionsFieldBuilder() {
      if (actionsBuilder_ == null) {
        actionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.iotexproject.grpc.types.Action, com.github.iotexproject.grpc.types.Action.Builder, com.github.iotexproject.grpc.types.ActionOrBuilder>(
                actions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        actions_ = null;
      }
      return actionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.Actions)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.Actions)
  private static final com.github.iotexproject.grpc.types.Actions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.Actions();
  }

  public static com.github.iotexproject.grpc.types.Actions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Actions>
      PARSER = new com.google.protobuf.AbstractParser<Actions>() {
    @java.lang.Override
    public Actions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Actions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Actions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.Actions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

