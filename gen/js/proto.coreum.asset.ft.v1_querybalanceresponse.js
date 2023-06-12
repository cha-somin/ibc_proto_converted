// source: coreum/asset/ft/v1/query.proto
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

goog.provide('proto.coreum.asset.ft.v1.QueryBalanceResponse');

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
proto.coreum.asset.ft.v1.QueryBalanceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.coreum.asset.ft.v1.QueryBalanceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.asset.ft.v1.QueryBalanceResponse.displayName = 'proto.coreum.asset.ft.v1.QueryBalanceResponse';
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
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.asset.ft.v1.QueryBalanceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.asset.ft.v1.QueryBalanceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    balance: jspb.Message.getFieldWithDefault(msg, 1, ""),
    whitelisted: jspb.Message.getFieldWithDefault(msg, 2, ""),
    frozen: jspb.Message.getFieldWithDefault(msg, 3, ""),
    locked: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.asset.ft.v1.QueryBalanceResponse;
  return proto.coreum.asset.ft.v1.QueryBalanceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.asset.ft.v1.QueryBalanceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBalance(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setWhitelisted(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrozen(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setLocked(value);
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
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.asset.ft.v1.QueryBalanceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.asset.ft.v1.QueryBalanceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBalance();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getWhitelisted();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getFrozen();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getLocked();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string balance = 1;
 * @return {string}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.getBalance = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse} returns this
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.setBalance = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string whitelisted = 2;
 * @return {string}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.getWhitelisted = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse} returns this
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.setWhitelisted = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string frozen = 3;
 * @return {string}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.getFrozen = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse} returns this
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.setFrozen = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string locked = 4;
 * @return {string}
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.getLocked = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.QueryBalanceResponse} returns this
 */
proto.coreum.asset.ft.v1.QueryBalanceResponse.prototype.setLocked = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


