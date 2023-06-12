// source: umee/oracle/v1/tx.proto
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

goog.provide('proto.umee.oracle.v1.MsgAggregateExchangeRateVote');

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
proto.umee.oracle.v1.MsgAggregateExchangeRateVote = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.umee.oracle.v1.MsgAggregateExchangeRateVote, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.oracle.v1.MsgAggregateExchangeRateVote.displayName = 'proto.umee.oracle.v1.MsgAggregateExchangeRateVote';
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
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.oracle.v1.MsgAggregateExchangeRateVote.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.toObject = function(includeInstance, msg) {
  var f, obj = {
    salt: jspb.Message.getFieldWithDefault(msg, 1, ""),
    exchangeRates: jspb.Message.getFieldWithDefault(msg, 2, ""),
    feeder: jspb.Message.getFieldWithDefault(msg, 3, ""),
    validator: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.oracle.v1.MsgAggregateExchangeRateVote;
  return proto.umee.oracle.v1.MsgAggregateExchangeRateVote.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSalt(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setExchangeRates(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeeder(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidator(value);
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
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.oracle.v1.MsgAggregateExchangeRateVote.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSalt();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getExchangeRates();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getFeeder();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getValidator();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string salt = 1;
 * @return {string}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.getSalt = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} returns this
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.setSalt = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string exchange_rates = 2;
 * @return {string}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.getExchangeRates = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} returns this
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.setExchangeRates = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string feeder = 3;
 * @return {string}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.getFeeder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} returns this
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.setFeeder = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string validator = 4;
 * @return {string}
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.getValidator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.MsgAggregateExchangeRateVote} returns this
 */
proto.umee.oracle.v1.MsgAggregateExchangeRateVote.prototype.setValidator = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


