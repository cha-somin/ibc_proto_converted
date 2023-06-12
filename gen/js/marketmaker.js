// source: crescent/marketmaker/v1beta1/marketmaker.proto
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

goog.provide('proto.crescent.marketmaker.v1beta1.MarketMaker');

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
proto.crescent.marketmaker.v1beta1.MarketMaker = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.marketmaker.v1beta1.MarketMaker, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.marketmaker.v1beta1.MarketMaker.displayName = 'proto.crescent.marketmaker.v1beta1.MarketMaker';
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
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.marketmaker.v1beta1.MarketMaker.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.marketmaker.v1beta1.MarketMaker} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pairId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    eligible: jspb.Message.getBooleanFieldWithDefault(msg, 3, false)
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
 * @return {!proto.crescent.marketmaker.v1beta1.MarketMaker}
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.marketmaker.v1beta1.MarketMaker;
  return proto.crescent.marketmaker.v1beta1.MarketMaker.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.marketmaker.v1beta1.MarketMaker} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.marketmaker.v1beta1.MarketMaker}
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPairId(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setEligible(value);
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
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.marketmaker.v1beta1.MarketMaker.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.marketmaker.v1beta1.MarketMaker} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPairId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getEligible();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
};


/**
 * optional string address = 1;
 * @return {string}
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.marketmaker.v1beta1.MarketMaker} returns this
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 pair_id = 2;
 * @return {number}
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.getPairId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.crescent.marketmaker.v1beta1.MarketMaker} returns this
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.setPairId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bool eligible = 3;
 * @return {boolean}
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.getEligible = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.crescent.marketmaker.v1beta1.MarketMaker} returns this
 */
proto.crescent.marketmaker.v1beta1.MarketMaker.prototype.setEligible = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


