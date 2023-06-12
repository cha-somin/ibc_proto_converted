// source: injective/exchange/v1beta1/genesis.proto
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

goog.provide('proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.AccountVolume');

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
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.displayName = 'proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.repeatedFields_ = [2];



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
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.toObject = function(includeInstance, msg) {
  var f, obj = {
    bucketStartTimestamp: jspb.Message.getFieldWithDefault(msg, 1, 0),
    accountVolumeList: jspb.Message.toObjectList(msg.getAccountVolumeList(),
    proto.injective.exchange.v1beta1.AccountVolume.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts}
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts;
  return proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts}
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBucketStartTimestamp(value);
      break;
    case 2:
      var value = new proto.injective.exchange.v1beta1.AccountVolume;
      reader.readMessage(value,proto.injective.exchange.v1beta1.AccountVolume.deserializeBinaryFromReader);
      msg.addAccountVolume(value);
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
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBucketStartTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getAccountVolumeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.injective.exchange.v1beta1.AccountVolume.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 bucket_start_timestamp = 1;
 * @return {number}
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.getBucketStartTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} returns this
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.setBucketStartTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated AccountVolume account_volume = 2;
 * @return {!Array<!proto.injective.exchange.v1beta1.AccountVolume>}
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.getAccountVolumeList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.AccountVolume>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.AccountVolume, 2));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.AccountVolume>} value
 * @return {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} returns this
*/
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.setAccountVolumeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.AccountVolume=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.AccountVolume}
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.addAccountVolume = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.injective.exchange.v1beta1.AccountVolume, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts} returns this
 */
proto.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.prototype.clearAccountVolumeList = function() {
  return this.setAccountVolumeList([]);
};


