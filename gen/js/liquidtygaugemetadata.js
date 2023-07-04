// source: comdex/rewards/v1beta1/gauge.proto
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

goog.provide('proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData');

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
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.repeatedFields_, null);
};
goog.inherits(proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.displayName = 'proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.repeatedFields_ = [3];



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
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    isMasterPool: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    childPoolIdsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData}
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData;
  return proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData}
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsMasterPool(value);
      break;
    case 3:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addChildPoolIds(values[i]);
      }
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
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getIsMasterPool();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getChildPoolIdsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      3,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} returns this
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bool is_master_pool = 2;
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.getIsMasterPool = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} returns this
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.setIsMasterPool = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * repeated uint64 child_pool_ids = 3;
 * @return {!Array<number>}
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.getChildPoolIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} returns this
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.setChildPoolIdsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} returns this
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.addChildPoolIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} returns this
 */
proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.prototype.clearChildPoolIdsList = function() {
  return this.setChildPoolIdsList([]);
};

