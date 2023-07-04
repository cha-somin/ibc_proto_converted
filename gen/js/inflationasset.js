// source: em/inflation/v1/inflation.proto
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

goog.provide('proto.em.inflation.v1.InflationAsset');

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
proto.em.inflation.v1.InflationAsset = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.inflation.v1.InflationAsset, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.inflation.v1.InflationAsset.displayName = 'proto.em.inflation.v1.InflationAsset';
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
proto.em.inflation.v1.InflationAsset.prototype.toObject = function(opt_includeInstance) {
  return proto.em.inflation.v1.InflationAsset.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.inflation.v1.InflationAsset} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.inflation.v1.InflationAsset.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    inflation: jspb.Message.getFieldWithDefault(msg, 2, ""),
    accum: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.em.inflation.v1.InflationAsset}
 */
proto.em.inflation.v1.InflationAsset.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.inflation.v1.InflationAsset;
  return proto.em.inflation.v1.InflationAsset.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.inflation.v1.InflationAsset} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.inflation.v1.InflationAsset}
 */
proto.em.inflation.v1.InflationAsset.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setInflation(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAccum(value);
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
proto.em.inflation.v1.InflationAsset.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.inflation.v1.InflationAsset.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.inflation.v1.InflationAsset} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.inflation.v1.InflationAsset.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getInflation();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAccum();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.em.inflation.v1.InflationAsset.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.inflation.v1.InflationAsset} returns this
 */
proto.em.inflation.v1.InflationAsset.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string inflation = 2;
 * @return {string}
 */
proto.em.inflation.v1.InflationAsset.prototype.getInflation = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.inflation.v1.InflationAsset} returns this
 */
proto.em.inflation.v1.InflationAsset.prototype.setInflation = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string accum = 3;
 * @return {string}
 */
proto.em.inflation.v1.InflationAsset.prototype.getAccum = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.inflation.v1.InflationAsset} returns this
 */
proto.em.inflation.v1.InflationAsset.prototype.setAccum = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

