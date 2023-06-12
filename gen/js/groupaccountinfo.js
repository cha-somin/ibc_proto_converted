// source: regen/group/v1alpha1/types.proto
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

goog.provide('proto.regen.group.v1alpha1.GroupAccountInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.regen.group.v1alpha1.GroupAccountInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.group.v1alpha1.GroupAccountInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.group.v1alpha1.GroupAccountInfo.displayName = 'proto.regen.group.v1alpha1.GroupAccountInfo';
}



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
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.group.v1alpha1.GroupAccountInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.group.v1alpha1.GroupAccountInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.GroupAccountInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: jspb.Message.getFieldWithDefault(msg, 1, ""),
    groupId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    admin: jspb.Message.getFieldWithDefault(msg, 3, ""),
    metadata: msg.getMetadata_asB64(),
    version: jspb.Message.getFieldWithDefault(msg, 5, 0),
    decisionPolicy: (f = msg.getDecisionPolicy()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    derivationKey: msg.getDerivationKey_asB64()
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
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.group.v1alpha1.GroupAccountInfo;
  return proto.regen.group.v1alpha1.GroupAccountInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.group.v1alpha1.GroupAccountInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGroupId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMetadata(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVersion(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setDecisionPolicy(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDerivationKey(value);
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
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.group.v1alpha1.GroupAccountInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.group.v1alpha1.GroupAccountInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.GroupAccountInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getGroupId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMetadata_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getVersion();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getDecisionPolicy();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getDerivationKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
};


/**
 * optional string address = 1;
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 group_id = 2;
 * @return {number}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getGroupId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setGroupId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string admin = 3;
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional bytes metadata = 4;
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes metadata = 4;
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getMetadata_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMetadata()));
};


/**
 * optional bytes metadata = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {!Uint8Array}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getMetadata_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMetadata()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional uint64 version = 5;
 * @return {number}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Any decision_policy = 6;
 * @return {?proto.google.protobuf.Any}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getDecisionPolicy = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 6));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
*/
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setDecisionPolicy = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.clearDecisionPolicy = function() {
  return this.setDecisionPolicy(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.hasDecisionPolicy = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional bytes derivation_key = 7;
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getDerivationKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes derivation_key = 7;
 * This is a type-conversion wrapper around `getDerivationKey()`
 * @return {string}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getDerivationKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDerivationKey()));
};


/**
 * optional bytes derivation_key = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDerivationKey()`
 * @return {!Uint8Array}
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.getDerivationKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDerivationKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.regen.group.v1alpha1.GroupAccountInfo} returns this
 */
proto.regen.group.v1alpha1.GroupAccountInfo.prototype.setDerivationKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


