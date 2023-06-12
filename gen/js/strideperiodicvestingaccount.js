// source: stride/vesting/vesting.proto
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

goog.provide('proto.stride.vesting.StridePeriodicVestingAccount');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.vesting.BaseVestingAccount');
goog.require('proto.stride.vesting.Period');

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
proto.stride.vesting.StridePeriodicVestingAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.vesting.StridePeriodicVestingAccount.repeatedFields_, null);
};
goog.inherits(proto.stride.vesting.StridePeriodicVestingAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.vesting.StridePeriodicVestingAccount.displayName = 'proto.stride.vesting.StridePeriodicVestingAccount';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.vesting.StridePeriodicVestingAccount.repeatedFields_ = [3];



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
proto.stride.vesting.StridePeriodicVestingAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.vesting.StridePeriodicVestingAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.vesting.StridePeriodicVestingAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.vesting.StridePeriodicVestingAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseVestingAccount: (f = msg.getBaseVestingAccount()) && proto.stride.vesting.BaseVestingAccount.toObject(includeInstance, f),
    vestingPeriodsList: jspb.Message.toObjectList(msg.getVestingPeriodsList(),
    proto.stride.vesting.Period.toObject, includeInstance)
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
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount}
 */
proto.stride.vesting.StridePeriodicVestingAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.vesting.StridePeriodicVestingAccount;
  return proto.stride.vesting.StridePeriodicVestingAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.vesting.StridePeriodicVestingAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount}
 */
proto.stride.vesting.StridePeriodicVestingAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.vesting.BaseVestingAccount;
      reader.readMessage(value,proto.stride.vesting.BaseVestingAccount.deserializeBinaryFromReader);
      msg.setBaseVestingAccount(value);
      break;
    case 3:
      var value = new proto.stride.vesting.Period;
      reader.readMessage(value,proto.stride.vesting.Period.deserializeBinaryFromReader);
      msg.addVestingPeriods(value);
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
proto.stride.vesting.StridePeriodicVestingAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.vesting.StridePeriodicVestingAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.vesting.StridePeriodicVestingAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.vesting.StridePeriodicVestingAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseVestingAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stride.vesting.BaseVestingAccount.serializeBinaryToWriter
    );
  }
  f = message.getVestingPeriodsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.stride.vesting.Period.serializeBinaryToWriter
    );
  }
};


/**
 * optional BaseVestingAccount base_vesting_account = 1;
 * @return {?proto.stride.vesting.BaseVestingAccount}
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.getBaseVestingAccount = function() {
  return /** @type{?proto.stride.vesting.BaseVestingAccount} */ (
    jspb.Message.getWrapperField(this, proto.stride.vesting.BaseVestingAccount, 1));
};


/**
 * @param {?proto.stride.vesting.BaseVestingAccount|undefined} value
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount} returns this
*/
proto.stride.vesting.StridePeriodicVestingAccount.prototype.setBaseVestingAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount} returns this
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.clearBaseVestingAccount = function() {
  return this.setBaseVestingAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.hasBaseVestingAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Period vesting_periods = 3;
 * @return {!Array<!proto.stride.vesting.Period>}
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.getVestingPeriodsList = function() {
  return /** @type{!Array<!proto.stride.vesting.Period>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.vesting.Period, 3));
};


/**
 * @param {!Array<!proto.stride.vesting.Period>} value
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount} returns this
*/
proto.stride.vesting.StridePeriodicVestingAccount.prototype.setVestingPeriodsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.stride.vesting.Period=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.vesting.Period}
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.addVestingPeriods = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.stride.vesting.Period, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.vesting.StridePeriodicVestingAccount} returns this
 */
proto.stride.vesting.StridePeriodicVestingAccount.prototype.clearVestingPeriodsList = function() {
  return this.setVestingPeriodsList([]);
};


