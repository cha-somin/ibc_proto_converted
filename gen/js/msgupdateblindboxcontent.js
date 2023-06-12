// source: likechain/likenft/v1/tx.proto
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

goog.provide('proto.likechain.likenft.v1.MsgUpdateBlindBoxContent');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.NFTInput');

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
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.MsgUpdateBlindBoxContent, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.displayName = 'proto.likechain.likenft.v1.MsgUpdateBlindBoxContent';
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
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    classId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    id: jspb.Message.getFieldWithDefault(msg, 3, ""),
    input: (f = msg.getInput()) && proto.likechain.likenft.v1.NFTInput.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.MsgUpdateBlindBoxContent;
  return proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setClassId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 4:
      var value = new proto.likechain.likenft.v1.NFTInput;
      reader.readMessage(value,proto.likechain.likenft.v1.NFTInput.deserializeBinaryFromReader);
      msg.setInput(value);
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
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getClassId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getInput();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.likechain.likenft.v1.NFTInput.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} returns this
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string class_id = 2;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.getClassId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} returns this
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.setClassId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string id = 3;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} returns this
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional NFTInput input = 4;
 * @return {?proto.likechain.likenft.v1.NFTInput}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.getInput = function() {
  return /** @type{?proto.likechain.likenft.v1.NFTInput} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.NFTInput, 4));
};


/**
 * @param {?proto.likechain.likenft.v1.NFTInput|undefined} value
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} returns this
*/
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.setInput = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.MsgUpdateBlindBoxContent} returns this
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.clearInput = function() {
  return this.setInput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.MsgUpdateBlindBoxContent.prototype.hasInput = function() {
  return jspb.Message.getField(this, 4) != null;
};


