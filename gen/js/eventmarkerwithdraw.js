// source: provenance/marker/v1/marker.proto
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

goog.provide('proto.provenance.marker.v1.EventMarkerWithdraw');

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
proto.provenance.marker.v1.EventMarkerWithdraw = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.marker.v1.EventMarkerWithdraw, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.EventMarkerWithdraw.displayName = 'proto.provenance.marker.v1.EventMarkerWithdraw';
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
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.EventMarkerWithdraw.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.EventMarkerWithdraw} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.EventMarkerWithdraw.toObject = function(includeInstance, msg) {
  var f, obj = {
    coins: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    administrator: jspb.Message.getFieldWithDefault(msg, 3, ""),
    toAddress: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.EventMarkerWithdraw;
  return proto.provenance.marker.v1.EventMarkerWithdraw.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.EventMarkerWithdraw} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCoins(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdministrator(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setToAddress(value);
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
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.EventMarkerWithdraw.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.EventMarkerWithdraw} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.EventMarkerWithdraw.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCoins();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAdministrator();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getToAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string coins = 1;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.getCoins = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw} returns this
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.setCoins = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denom = 2;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw} returns this
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string administrator = 3;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.getAdministrator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw} returns this
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.setAdministrator = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string to_address = 4;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.getToAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerWithdraw} returns this
 */
proto.provenance.marker.v1.EventMarkerWithdraw.prototype.setToAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


