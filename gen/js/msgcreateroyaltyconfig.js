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

goog.provide('proto.likechain.likenft.v1.MsgCreateRoyaltyConfig');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.RoyaltyConfigInput');

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
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.MsgCreateRoyaltyConfig, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.displayName = 'proto.likechain.likenft.v1.MsgCreateRoyaltyConfig';
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
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    classId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    royaltyConfig: (f = msg.getRoyaltyConfig()) && proto.likechain.likenft.v1.RoyaltyConfigInput.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.MsgCreateRoyaltyConfig;
  return proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.likechain.likenft.v1.RoyaltyConfigInput;
      reader.readMessage(value,proto.likechain.likenft.v1.RoyaltyConfigInput.deserializeBinaryFromReader);
      msg.setRoyaltyConfig(value);
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
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getRoyaltyConfig();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.likechain.likenft.v1.RoyaltyConfigInput.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} returns this
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string class_id = 2;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.getClassId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} returns this
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.setClassId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional RoyaltyConfigInput royalty_config = 3;
 * @return {?proto.likechain.likenft.v1.RoyaltyConfigInput}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.getRoyaltyConfig = function() {
  return /** @type{?proto.likechain.likenft.v1.RoyaltyConfigInput} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.RoyaltyConfigInput, 3));
};


/**
 * @param {?proto.likechain.likenft.v1.RoyaltyConfigInput|undefined} value
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} returns this
*/
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.setRoyaltyConfig = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.MsgCreateRoyaltyConfig} returns this
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.clearRoyaltyConfig = function() {
  return this.setRoyaltyConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.MsgCreateRoyaltyConfig.prototype.hasRoyaltyConfig = function() {
  return jspb.Message.getField(this, 3) != null;
};


