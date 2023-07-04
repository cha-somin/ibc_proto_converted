// source: quasar/qoracle/osmosis/query.proto
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

goog.provide('proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.epochs.v1beta1.EpochInfo');
goog.require('proto.osmosis.mint.v1beta1.Params');
goog.require('proto.osmosis.poolincentives.v1beta1.DistrInfo');

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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.repeatedFields_, null);
};
goog.inherits(proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.displayName = 'proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.repeatedFields_ = [1,2];



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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    epochsInfoList: jspb.Message.toObjectList(msg.getEpochsInfoList(),
    proto.osmosis.epochs.v1beta1.EpochInfo.toObject, includeInstance),
    lockableDurationsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    mintParams: (f = msg.getMintParams()) && proto.osmosis.mint.v1beta1.Params.toObject(includeInstance, f),
    mintEpochProvisions: msg.getMintEpochProvisions_asB64(),
    distrInfo: (f = msg.getDistrInfo()) && proto.osmosis.poolincentives.v1beta1.DistrInfo.toObject(includeInstance, f)
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
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse;
  return proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.epochs.v1beta1.EpochInfo;
      reader.readMessage(value,proto.osmosis.epochs.v1beta1.EpochInfo.deserializeBinaryFromReader);
      msg.addEpochsInfo(value);
      break;
    case 2:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedInt64() : [reader.readInt64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addLockableDurations(values[i]);
      }
      break;
    case 3:
      var value = new proto.osmosis.mint.v1beta1.Params;
      reader.readMessage(value,proto.osmosis.mint.v1beta1.Params.deserializeBinaryFromReader);
      msg.setMintParams(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMintEpochProvisions(value);
      break;
    case 5:
      var value = new proto.osmosis.poolincentives.v1beta1.DistrInfo;
      reader.readMessage(value,proto.osmosis.poolincentives.v1beta1.DistrInfo.deserializeBinaryFromReader);
      msg.setDistrInfo(value);
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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEpochsInfoList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.epochs.v1beta1.EpochInfo.serializeBinaryToWriter
    );
  }
  f = message.getLockableDurationsList();
  if (f.length > 0) {
    writer.writePackedInt64(
      2,
      f
    );
  }
  f = message.getMintParams();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.osmosis.mint.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getMintEpochProvisions_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getDistrInfo();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.osmosis.poolincentives.v1beta1.DistrInfo.serializeBinaryToWriter
    );
  }
};


/**
 * repeated osmosis.epochs.v1beta1.EpochInfo epochs_info = 1;
 * @return {!Array<!proto.osmosis.epochs.v1beta1.EpochInfo>}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getEpochsInfoList = function() {
  return /** @type{!Array<!proto.osmosis.epochs.v1beta1.EpochInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.epochs.v1beta1.EpochInfo, 1));
};


/**
 * @param {!Array<!proto.osmosis.epochs.v1beta1.EpochInfo>} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
*/
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.setEpochsInfoList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.epochs.v1beta1.EpochInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.epochs.v1beta1.EpochInfo}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.addEpochsInfo = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.epochs.v1beta1.EpochInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.clearEpochsInfoList = function() {
  return this.setEpochsInfoList([]);
};


/**
 * repeated int64 lockable_durations = 2;
 * @return {!Array<number>}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getLockableDurationsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.setLockableDurationsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.addLockableDurations = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.clearLockableDurationsList = function() {
  return this.setLockableDurationsList([]);
};


/**
 * optional osmosis.mint.v1beta1.Params mint_params = 3;
 * @return {?proto.osmosis.mint.v1beta1.Params}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getMintParams = function() {
  return /** @type{?proto.osmosis.mint.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.mint.v1beta1.Params, 3));
};


/**
 * @param {?proto.osmosis.mint.v1beta1.Params|undefined} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
*/
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.setMintParams = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.clearMintParams = function() {
  return this.setMintParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.hasMintParams = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes mint_epoch_provisions = 4;
 * @return {string}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getMintEpochProvisions = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes mint_epoch_provisions = 4;
 * This is a type-conversion wrapper around `getMintEpochProvisions()`
 * @return {string}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getMintEpochProvisions_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMintEpochProvisions()));
};


/**
 * optional bytes mint_epoch_provisions = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMintEpochProvisions()`
 * @return {!Uint8Array}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getMintEpochProvisions_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMintEpochProvisions()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.setMintEpochProvisions = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional osmosis.poolincentives.v1beta1.DistrInfo distr_info = 5;
 * @return {?proto.osmosis.poolincentives.v1beta1.DistrInfo}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.getDistrInfo = function() {
  return /** @type{?proto.osmosis.poolincentives.v1beta1.DistrInfo} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.poolincentives.v1beta1.DistrInfo, 5));
};


/**
 * @param {?proto.osmosis.poolincentives.v1beta1.DistrInfo|undefined} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
*/
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.setDistrInfo = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.clearDistrInfo = function() {
  return this.setDistrInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.prototype.hasDistrInfo = function() {
  return jspb.Message.getField(this, 5) != null;
};

