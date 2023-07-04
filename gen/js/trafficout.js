// source: axelar/tss/tofnd/v1beta1/tofnd.proto
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

goog.provide('proto.axelar.tss.tofnd.v1beta1.TrafficOut');

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
proto.axelar.tss.tofnd.v1beta1.TrafficOut = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.tss.tofnd.v1beta1.TrafficOut, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.tss.tofnd.v1beta1.TrafficOut.displayName = 'proto.axelar.tss.tofnd.v1beta1.TrafficOut';
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
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.tss.tofnd.v1beta1.TrafficOut.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.toObject = function(includeInstance, msg) {
  var f, obj = {
    toPartyUid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    payload: msg.getPayload_asB64(),
    isBroadcast: jspb.Message.getBooleanFieldWithDefault(msg, 3, false)
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
 * @return {!proto.axelar.tss.tofnd.v1beta1.TrafficOut}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.tss.tofnd.v1beta1.TrafficOut;
  return proto.axelar.tss.tofnd.v1beta1.TrafficOut.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.tss.tofnd.v1beta1.TrafficOut}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setToPartyUid(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPayload(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsBroadcast(value);
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
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.tss.tofnd.v1beta1.TrafficOut.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getToPartyUid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPayload_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getIsBroadcast();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
};


/**
 * optional string to_party_uid = 1;
 * @return {string}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.getToPartyUid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} returns this
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.setToPartyUid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes payload = 2;
 * @return {string}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.getPayload = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes payload = 2;
 * This is a type-conversion wrapper around `getPayload()`
 * @return {string}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.getPayload_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPayload()));
};


/**
 * optional bytes payload = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPayload()`
 * @return {!Uint8Array}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.getPayload_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPayload()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} returns this
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.setPayload = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bool is_broadcast = 3;
 * @return {boolean}
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.getIsBroadcast = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.axelar.tss.tofnd.v1beta1.TrafficOut} returns this
 */
proto.axelar.tss.tofnd.v1beta1.TrafficOut.prototype.setIsBroadcast = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};

