// source: osmosis/protorev/v1beta1/protorev.proto
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

goog.provide('proto.osmosis.protorev.v1beta1.PoolWeights');

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
proto.osmosis.protorev.v1beta1.PoolWeights = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.protorev.v1beta1.PoolWeights, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.protorev.v1beta1.PoolWeights.displayName = 'proto.osmosis.protorev.v1beta1.PoolWeights';
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
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.protorev.v1beta1.PoolWeights.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.protorev.v1beta1.PoolWeights} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.PoolWeights.toObject = function(includeInstance, msg) {
  var f, obj = {
    stableWeight: jspb.Message.getFieldWithDefault(msg, 1, 0),
    balancerWeight: jspb.Message.getFieldWithDefault(msg, 2, 0),
    concentratedWeight: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.osmosis.protorev.v1beta1.PoolWeights}
 */
proto.osmosis.protorev.v1beta1.PoolWeights.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.protorev.v1beta1.PoolWeights;
  return proto.osmosis.protorev.v1beta1.PoolWeights.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.protorev.v1beta1.PoolWeights} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.protorev.v1beta1.PoolWeights}
 */
proto.osmosis.protorev.v1beta1.PoolWeights.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setStableWeight(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBalancerWeight(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setConcentratedWeight(value);
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
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.protorev.v1beta1.PoolWeights.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.protorev.v1beta1.PoolWeights} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.PoolWeights.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStableWeight();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getBalancerWeight();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getConcentratedWeight();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional uint64 stable_weight = 1;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.getStableWeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.PoolWeights} returns this
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.setStableWeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 balancer_weight = 2;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.getBalancerWeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.PoolWeights} returns this
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.setBalancerWeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 concentrated_weight = 3;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.getConcentratedWeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.PoolWeights} returns this
 */
proto.osmosis.protorev.v1beta1.PoolWeights.prototype.setConcentratedWeight = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


