// source: kyve/bundles/v1beta1/params.proto
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

goog.provide('proto.kyve.bundles.v1beta1.Params');

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
proto.kyve.bundles.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.bundles.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.bundles.v1beta1.Params.displayName = 'proto.kyve.bundles.v1beta1.Params';
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
proto.kyve.bundles.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.bundles.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.bundles.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    uploadTimeout: jspb.Message.getFieldWithDefault(msg, 1, 0),
    storageCost: jspb.Message.getFieldWithDefault(msg, 2, ""),
    networkFee: jspb.Message.getFieldWithDefault(msg, 3, ""),
    maxPoints: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.kyve.bundles.v1beta1.Params}
 */
proto.kyve.bundles.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.bundles.v1beta1.Params;
  return proto.kyve.bundles.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.bundles.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.bundles.v1beta1.Params}
 */
proto.kyve.bundles.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUploadTimeout(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStorageCost(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNetworkFee(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxPoints(value);
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
proto.kyve.bundles.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.bundles.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.bundles.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUploadTimeout();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStorageCost();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getNetworkFee();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMaxPoints();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional uint64 upload_timeout = 1;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.Params.prototype.getUploadTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.Params} returns this
 */
proto.kyve.bundles.v1beta1.Params.prototype.setUploadTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string storage_cost = 2;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.Params.prototype.getStorageCost = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.Params} returns this
 */
proto.kyve.bundles.v1beta1.Params.prototype.setStorageCost = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string network_fee = 3;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.Params.prototype.getNetworkFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.Params} returns this
 */
proto.kyve.bundles.v1beta1.Params.prototype.setNetworkFee = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 max_points = 4;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.Params.prototype.getMaxPoints = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.Params} returns this
 */
proto.kyve.bundles.v1beta1.Params.prototype.setMaxPoints = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


