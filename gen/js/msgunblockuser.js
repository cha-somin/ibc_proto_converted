// source: desmos/relationships/v1/msgs.proto
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

goog.provide('proto.desmos.relationships.v1.MsgUnblockUser');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.desmos.relationships.v1.MsgUnblockUser = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.relationships.v1.MsgUnblockUser, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.relationships.v1.MsgUnblockUser.displayName = 'proto.desmos.relationships.v1.MsgUnblockUser';
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
proto.desmos.relationships.v1.MsgUnblockUser.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.relationships.v1.MsgUnblockUser.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.relationships.v1.MsgUnblockUser} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.relationships.v1.MsgUnblockUser.toObject = function(includeInstance, msg) {
  var f, obj = {
    blocker: jspb.Message.getFieldWithDefault(msg, 1, ""),
    blocked: jspb.Message.getFieldWithDefault(msg, 2, ""),
    subspaceId: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.desmos.relationships.v1.MsgUnblockUser}
 */
proto.desmos.relationships.v1.MsgUnblockUser.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.relationships.v1.MsgUnblockUser;
  return proto.desmos.relationships.v1.MsgUnblockUser.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.relationships.v1.MsgUnblockUser} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.relationships.v1.MsgUnblockUser}
 */
proto.desmos.relationships.v1.MsgUnblockUser.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBlocker(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBlocked(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
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
proto.desmos.relationships.v1.MsgUnblockUser.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.relationships.v1.MsgUnblockUser.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.relationships.v1.MsgUnblockUser} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.relationships.v1.MsgUnblockUser.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlocker();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBlocked();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional string blocker = 1;
 * @return {string}
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.getBlocker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.relationships.v1.MsgUnblockUser} returns this
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.setBlocker = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string blocked = 2;
 * @return {string}
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.getBlocked = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.relationships.v1.MsgUnblockUser} returns this
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.setBlocked = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 subspace_id = 4;
 * @return {number}
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.relationships.v1.MsgUnblockUser} returns this
 */
proto.desmos.relationships.v1.MsgUnblockUser.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


