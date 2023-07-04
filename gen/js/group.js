// source: akash/deployment/v1beta3/group.proto
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

goog.provide('proto.akash.deployment.v1beta3.Group');
goog.provide('proto.akash.deployment.v1beta3.Group.State');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.deployment.v1beta3.GroupID');
goog.require('proto.akash.deployment.v1beta3.GroupSpec');

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
proto.akash.deployment.v1beta3.Group = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.deployment.v1beta3.Group, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.deployment.v1beta3.Group.displayName = 'proto.akash.deployment.v1beta3.Group';
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
proto.akash.deployment.v1beta3.Group.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.deployment.v1beta3.Group.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.deployment.v1beta3.Group} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta3.Group.toObject = function(includeInstance, msg) {
  var f, obj = {
    groupId: (f = msg.getGroupId()) && proto.akash.deployment.v1beta3.GroupID.toObject(includeInstance, f),
    state: jspb.Message.getFieldWithDefault(msg, 2, 0),
    groupSpec: (f = msg.getGroupSpec()) && proto.akash.deployment.v1beta3.GroupSpec.toObject(includeInstance, f),
    createdAt: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.akash.deployment.v1beta3.Group}
 */
proto.akash.deployment.v1beta3.Group.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.deployment.v1beta3.Group;
  return proto.akash.deployment.v1beta3.Group.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.deployment.v1beta3.Group} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.deployment.v1beta3.Group}
 */
proto.akash.deployment.v1beta3.Group.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.deployment.v1beta3.GroupID;
      reader.readMessage(value,proto.akash.deployment.v1beta3.GroupID.deserializeBinaryFromReader);
      msg.setGroupId(value);
      break;
    case 2:
      var value = /** @type {!proto.akash.deployment.v1beta3.Group.State} */ (reader.readEnum());
      msg.setState(value);
      break;
    case 3:
      var value = new proto.akash.deployment.v1beta3.GroupSpec;
      reader.readMessage(value,proto.akash.deployment.v1beta3.GroupSpec.deserializeBinaryFromReader);
      msg.setGroupSpec(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCreatedAt(value);
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
proto.akash.deployment.v1beta3.Group.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.deployment.v1beta3.Group.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.deployment.v1beta3.Group} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta3.Group.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGroupId();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.deployment.v1beta3.GroupID.serializeBinaryToWriter
    );
  }
  f = message.getState();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getGroupSpec();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.akash.deployment.v1beta3.GroupSpec.serializeBinaryToWriter
    );
  }
  f = message.getCreatedAt();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.akash.deployment.v1beta3.Group.State = {
  INVALID: 0,
  OPEN: 1,
  PAUSED: 2,
  INSUFFICIENT_FUNDS: 3,
  CLOSED: 4
};

/**
 * optional GroupID group_id = 1;
 * @return {?proto.akash.deployment.v1beta3.GroupID}
 */
proto.akash.deployment.v1beta3.Group.prototype.getGroupId = function() {
  return /** @type{?proto.akash.deployment.v1beta3.GroupID} */ (
    jspb.Message.getWrapperField(this, proto.akash.deployment.v1beta3.GroupID, 1));
};


/**
 * @param {?proto.akash.deployment.v1beta3.GroupID|undefined} value
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
*/
proto.akash.deployment.v1beta3.Group.prototype.setGroupId = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
 */
proto.akash.deployment.v1beta3.Group.prototype.clearGroupId = function() {
  return this.setGroupId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta3.Group.prototype.hasGroupId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional State state = 2;
 * @return {!proto.akash.deployment.v1beta3.Group.State}
 */
proto.akash.deployment.v1beta3.Group.prototype.getState = function() {
  return /** @type {!proto.akash.deployment.v1beta3.Group.State} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.akash.deployment.v1beta3.Group.State} value
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
 */
proto.akash.deployment.v1beta3.Group.prototype.setState = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional GroupSpec group_spec = 3;
 * @return {?proto.akash.deployment.v1beta3.GroupSpec}
 */
proto.akash.deployment.v1beta3.Group.prototype.getGroupSpec = function() {
  return /** @type{?proto.akash.deployment.v1beta3.GroupSpec} */ (
    jspb.Message.getWrapperField(this, proto.akash.deployment.v1beta3.GroupSpec, 3));
};


/**
 * @param {?proto.akash.deployment.v1beta3.GroupSpec|undefined} value
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
*/
proto.akash.deployment.v1beta3.Group.prototype.setGroupSpec = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
 */
proto.akash.deployment.v1beta3.Group.prototype.clearGroupSpec = function() {
  return this.setGroupSpec(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta3.Group.prototype.hasGroupSpec = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional int64 created_at = 4;
 * @return {number}
 */
proto.akash.deployment.v1beta3.Group.prototype.getCreatedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.akash.deployment.v1beta3.Group} returns this
 */
proto.akash.deployment.v1beta3.Group.prototype.setCreatedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};

