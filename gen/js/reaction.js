// source: desmos/reactions/v1/models.proto
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

goog.provide('proto.desmos.reactions.v1.Reaction');

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
proto.desmos.reactions.v1.Reaction = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reactions.v1.Reaction, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reactions.v1.Reaction.displayName = 'proto.desmos.reactions.v1.Reaction';
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
proto.desmos.reactions.v1.Reaction.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reactions.v1.Reaction.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reactions.v1.Reaction} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.Reaction.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    postId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    id: jspb.Message.getFieldWithDefault(msg, 3, 0),
    value: (f = msg.getValue()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    author: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.desmos.reactions.v1.Reaction}
 */
proto.desmos.reactions.v1.Reaction.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reactions.v1.Reaction;
  return proto.desmos.reactions.v1.Reaction.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reactions.v1.Reaction} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reactions.v1.Reaction}
 */
proto.desmos.reactions.v1.Reaction.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setId(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setValue(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthor(value);
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
proto.desmos.reactions.v1.Reaction.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reactions.v1.Reaction.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reactions.v1.Reaction} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.Reaction.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getId();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getValue();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getAuthor();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.reactions.v1.Reaction.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
 */
proto.desmos.reactions.v1.Reaction.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 post_id = 2;
 * @return {number}
 */
proto.desmos.reactions.v1.Reaction.prototype.getPostId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
 */
proto.desmos.reactions.v1.Reaction.prototype.setPostId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 id = 3;
 * @return {number}
 */
proto.desmos.reactions.v1.Reaction.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
 */
proto.desmos.reactions.v1.Reaction.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional google.protobuf.Any value = 4;
 * @return {?proto.google.protobuf.Any}
 */
proto.desmos.reactions.v1.Reaction.prototype.getValue = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
*/
proto.desmos.reactions.v1.Reaction.prototype.setValue = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
 */
proto.desmos.reactions.v1.Reaction.prototype.clearValue = function() {
  return this.setValue(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reactions.v1.Reaction.prototype.hasValue = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string author = 5;
 * @return {string}
 */
proto.desmos.reactions.v1.Reaction.prototype.getAuthor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.reactions.v1.Reaction} returns this
 */
proto.desmos.reactions.v1.Reaction.prototype.setAuthor = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


