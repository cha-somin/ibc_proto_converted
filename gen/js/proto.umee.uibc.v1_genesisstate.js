// source: umee/uibc/v1/genesis.proto
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

goog.provide('proto.umee.uibc.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.umee.uibc.v1.Params');

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
proto.umee.uibc.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.uibc.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.umee.uibc.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.uibc.v1.GenesisState.displayName = 'proto.umee.uibc.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.uibc.v1.GenesisState.repeatedFields_ = [2];



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
proto.umee.uibc.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.uibc.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.uibc.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.uibc.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.umee.uibc.v1.Params.toObject(includeInstance, f),
    outflowsList: jspb.Message.toObjectList(msg.getOutflowsList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    totalOutflowSum: jspb.Message.getFieldWithDefault(msg, 3, ""),
    quotaExpires: (f = msg.getQuotaExpires()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.umee.uibc.v1.GenesisState}
 */
proto.umee.uibc.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.uibc.v1.GenesisState;
  return proto.umee.uibc.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.uibc.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.uibc.v1.GenesisState}
 */
proto.umee.uibc.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.umee.uibc.v1.Params;
      reader.readMessage(value,proto.umee.uibc.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addOutflows(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalOutflowSum(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setQuotaExpires(value);
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
proto.umee.uibc.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.uibc.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.uibc.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.uibc.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.umee.uibc.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getOutflowsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getTotalOutflowSum();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getQuotaExpires();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.umee.uibc.v1.Params}
 */
proto.umee.uibc.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.umee.uibc.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.umee.uibc.v1.Params, 1));
};


/**
 * @param {?proto.umee.uibc.v1.Params|undefined} value
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
*/
proto.umee.uibc.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
 */
proto.umee.uibc.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.umee.uibc.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated cosmos.base.v1beta1.DecCoin outflows = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.umee.uibc.v1.GenesisState.prototype.getOutflowsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
*/
proto.umee.uibc.v1.GenesisState.prototype.setOutflowsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.umee.uibc.v1.GenesisState.prototype.addOutflows = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
 */
proto.umee.uibc.v1.GenesisState.prototype.clearOutflowsList = function() {
  return this.setOutflowsList([]);
};


/**
 * optional string total_outflow_sum = 3;
 * @return {string}
 */
proto.umee.uibc.v1.GenesisState.prototype.getTotalOutflowSum = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
 */
proto.umee.uibc.v1.GenesisState.prototype.setTotalOutflowSum = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp quota_expires = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.umee.uibc.v1.GenesisState.prototype.getQuotaExpires = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
*/
proto.umee.uibc.v1.GenesisState.prototype.setQuotaExpires = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.umee.uibc.v1.GenesisState} returns this
 */
proto.umee.uibc.v1.GenesisState.prototype.clearQuotaExpires = function() {
  return this.setQuotaExpires(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.umee.uibc.v1.GenesisState.prototype.hasQuotaExpires = function() {
  return jspb.Message.getField(this, 4) != null;
};


