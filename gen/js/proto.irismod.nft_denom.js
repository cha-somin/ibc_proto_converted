// source: irismod/nft/nft.proto
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

goog.provide('proto.irismod.nft.Denom');

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
proto.irismod.nft.Denom = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.nft.Denom, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.nft.Denom.displayName = 'proto.irismod.nft.Denom';
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
proto.irismod.nft.Denom.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.nft.Denom.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.nft.Denom} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.nft.Denom.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    schema: jspb.Message.getFieldWithDefault(msg, 3, ""),
    creator: jspb.Message.getFieldWithDefault(msg, 4, ""),
    symbol: jspb.Message.getFieldWithDefault(msg, 5, ""),
    mintRestricted: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
    updateRestricted: jspb.Message.getBooleanFieldWithDefault(msg, 7, false)
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
 * @return {!proto.irismod.nft.Denom}
 */
proto.irismod.nft.Denom.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.nft.Denom;
  return proto.irismod.nft.Denom.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.nft.Denom} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.nft.Denom}
 */
proto.irismod.nft.Denom.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSchema(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbol(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setMintRestricted(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setUpdateRestricted(value);
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
proto.irismod.nft.Denom.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.nft.Denom.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.nft.Denom} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.nft.Denom.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSchema();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSymbol();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMintRestricted();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getUpdateRestricted();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.irismod.nft.Denom.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.irismod.nft.Denom.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string schema = 3;
 * @return {string}
 */
proto.irismod.nft.Denom.prototype.getSchema = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setSchema = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string creator = 4;
 * @return {string}
 */
proto.irismod.nft.Denom.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string symbol = 5;
 * @return {string}
 */
proto.irismod.nft.Denom.prototype.getSymbol = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setSymbol = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional bool mint_restricted = 6;
 * @return {boolean}
 */
proto.irismod.nft.Denom.prototype.getMintRestricted = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setMintRestricted = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * optional bool update_restricted = 7;
 * @return {boolean}
 */
proto.irismod.nft.Denom.prototype.getUpdateRestricted = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.irismod.nft.Denom} returns this
 */
proto.irismod.nft.Denom.prototype.setUpdateRestricted = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


