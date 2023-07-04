// source: kava/incentive/v1beta1/claims.proto
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

goog.provide('proto.kava.incentive.v1beta1.SwapClaim');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.incentive.v1beta1.BaseMultiClaim');
goog.require('proto.kava.incentive.v1beta1.MultiRewardIndex');

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
proto.kava.incentive.v1beta1.SwapClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.incentive.v1beta1.SwapClaim.repeatedFields_, null);
};
goog.inherits(proto.kava.incentive.v1beta1.SwapClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.incentive.v1beta1.SwapClaim.displayName = 'proto.kava.incentive.v1beta1.SwapClaim';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.incentive.v1beta1.SwapClaim.repeatedFields_ = [2];



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
proto.kava.incentive.v1beta1.SwapClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.incentive.v1beta1.SwapClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.incentive.v1beta1.SwapClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.SwapClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseClaim: (f = msg.getBaseClaim()) && proto.kava.incentive.v1beta1.BaseMultiClaim.toObject(includeInstance, f),
    rewardIndexesList: jspb.Message.toObjectList(msg.getRewardIndexesList(),
    proto.kava.incentive.v1beta1.MultiRewardIndex.toObject, includeInstance)
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
 * @return {!proto.kava.incentive.v1beta1.SwapClaim}
 */
proto.kava.incentive.v1beta1.SwapClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.incentive.v1beta1.SwapClaim;
  return proto.kava.incentive.v1beta1.SwapClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.incentive.v1beta1.SwapClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.incentive.v1beta1.SwapClaim}
 */
proto.kava.incentive.v1beta1.SwapClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.incentive.v1beta1.BaseMultiClaim;
      reader.readMessage(value,proto.kava.incentive.v1beta1.BaseMultiClaim.deserializeBinaryFromReader);
      msg.setBaseClaim(value);
      break;
    case 2:
      var value = new proto.kava.incentive.v1beta1.MultiRewardIndex;
      reader.readMessage(value,proto.kava.incentive.v1beta1.MultiRewardIndex.deserializeBinaryFromReader);
      msg.addRewardIndexes(value);
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
proto.kava.incentive.v1beta1.SwapClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.incentive.v1beta1.SwapClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.incentive.v1beta1.SwapClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.SwapClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseClaim();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kava.incentive.v1beta1.BaseMultiClaim.serializeBinaryToWriter
    );
  }
  f = message.getRewardIndexesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.kava.incentive.v1beta1.MultiRewardIndex.serializeBinaryToWriter
    );
  }
};


/**
 * optional BaseMultiClaim base_claim = 1;
 * @return {?proto.kava.incentive.v1beta1.BaseMultiClaim}
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.getBaseClaim = function() {
  return /** @type{?proto.kava.incentive.v1beta1.BaseMultiClaim} */ (
    jspb.Message.getWrapperField(this, proto.kava.incentive.v1beta1.BaseMultiClaim, 1));
};


/**
 * @param {?proto.kava.incentive.v1beta1.BaseMultiClaim|undefined} value
 * @return {!proto.kava.incentive.v1beta1.SwapClaim} returns this
*/
proto.kava.incentive.v1beta1.SwapClaim.prototype.setBaseClaim = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.incentive.v1beta1.SwapClaim} returns this
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.clearBaseClaim = function() {
  return this.setBaseClaim(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.hasBaseClaim = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated MultiRewardIndex reward_indexes = 2;
 * @return {!Array<!proto.kava.incentive.v1beta1.MultiRewardIndex>}
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.getRewardIndexesList = function() {
  return /** @type{!Array<!proto.kava.incentive.v1beta1.MultiRewardIndex>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.incentive.v1beta1.MultiRewardIndex, 2));
};


/**
 * @param {!Array<!proto.kava.incentive.v1beta1.MultiRewardIndex>} value
 * @return {!proto.kava.incentive.v1beta1.SwapClaim} returns this
*/
proto.kava.incentive.v1beta1.SwapClaim.prototype.setRewardIndexesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.kava.incentive.v1beta1.MultiRewardIndex=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.incentive.v1beta1.MultiRewardIndex}
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.addRewardIndexes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.kava.incentive.v1beta1.MultiRewardIndex, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.incentive.v1beta1.SwapClaim} returns this
 */
proto.kava.incentive.v1beta1.SwapClaim.prototype.clearRewardIndexesList = function() {
  return this.setRewardIndexesList([]);
};

