// source: regen/group/v1alpha1/tx.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.regen.group.v1alpha1.MsgCreateGroup');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.group.v1alpha1.Member');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.regen.group.v1alpha1.MsgCreateGroup = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.group.v1alpha1.MsgCreateGroup.repeatedFields_, null);
};
goog.inherits(proto.regen.group.v1alpha1.MsgCreateGroup, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.group.v1alpha1.MsgCreateGroup.displayName = 'proto.regen.group.v1alpha1.MsgCreateGroup';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.group.v1alpha1.MsgCreateGroup.repeatedFields_ = [2];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.group.v1alpha1.MsgCreateGroup.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.group.v1alpha1.MsgCreateGroup} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.MsgCreateGroup.toObject = function(includeInstance, msg) {
  var f, obj = {
    admin: jspb.Message.getFieldWithDefault(msg, 1, ""),
    membersList: jspb.Message.toObjectList(msg.getMembersList(),
    proto.regen.group.v1alpha1.Member.toObject, includeInstance),
    metadata: msg.getMetadata_asB64()
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.group.v1alpha1.MsgCreateGroup;
  return proto.regen.group.v1alpha1.MsgCreateGroup.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.group.v1alpha1.MsgCreateGroup} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 2:
      var value = new proto.regen.group.v1alpha1.Member;
      reader.readMessage(value,proto.regen.group.v1alpha1.Member.deserializeBinaryFromReader);
      msg.addMembers(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMetadata(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.group.v1alpha1.MsgCreateGroup.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.group.v1alpha1.MsgCreateGroup} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.MsgCreateGroup.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMembersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.regen.group.v1alpha1.Member.serializeBinaryToWriter
    );
  }
  f = message.getMetadata_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional string admin = 1;
 * @return {string}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup} returns this
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Member members = 2;
 * @return {!Array<!proto.regen.group.v1alpha1.Member>}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.getMembersList = function() {
  return /** @type{!Array<!proto.regen.group.v1alpha1.Member>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.group.v1alpha1.Member, 2));
};


/**
 * @param {!Array<!proto.regen.group.v1alpha1.Member>} value
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup} returns this
*/
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.setMembersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.regen.group.v1alpha1.Member=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.group.v1alpha1.Member}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.addMembers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.regen.group.v1alpha1.Member, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup} returns this
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.clearMembersList = function() {
  return this.setMembersList([]);
};


/**
 * optional bytes metadata = 3;
 * @return {string}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes metadata = 3;
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {string}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.getMetadata_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMetadata()));
};


/**
 * optional bytes metadata = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {!Uint8Array}
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.getMetadata_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMetadata()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.regen.group.v1alpha1.MsgCreateGroup} returns this
 */
proto.regen.group.v1alpha1.MsgCreateGroup.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


