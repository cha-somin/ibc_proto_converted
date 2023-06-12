// source: desmos/reactions/v1/msgs.proto
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

goog.provide('proto.desmos.reactions.v1.MsgRemoveReaction');

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
proto.desmos.reactions.v1.MsgRemoveReaction = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reactions.v1.MsgRemoveReaction, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reactions.v1.MsgRemoveReaction.displayName = 'proto.desmos.reactions.v1.MsgRemoveReaction';
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
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reactions.v1.MsgRemoveReaction.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reactions.v1.MsgRemoveReaction} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.MsgRemoveReaction.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    postId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    reactionId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    user: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reactions.v1.MsgRemoveReaction;
  return proto.desmos.reactions.v1.MsgRemoveReaction.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reactions.v1.MsgRemoveReaction} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPostId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setReactionId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUser(value);
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
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reactions.v1.MsgRemoveReaction.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reactions.v1.MsgRemoveReaction} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.MsgRemoveReaction.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getPostId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getReactionId();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getUser();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction} returns this
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 post_id = 2;
 * @return {number}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.getPostId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction} returns this
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.setPostId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 reaction_id = 3;
 * @return {number}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.getReactionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction} returns this
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.setReactionId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string user = 4;
 * @return {string}
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.getUser = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.reactions.v1.MsgRemoveReaction} returns this
 */
proto.desmos.reactions.v1.MsgRemoveReaction.prototype.setUser = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


