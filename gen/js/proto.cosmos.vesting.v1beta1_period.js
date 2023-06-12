// source: cosmos/vesting/v1beta1/vesting.proto
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

goog.provide('proto.cosmos.vesting.v1beta1.Period');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.cosmos.vesting.v1beta1.Period = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.vesting.v1beta1.Period.repeatedFields_, null);
};
goog.inherits(proto.cosmos.vesting.v1beta1.Period, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.vesting.v1beta1.Period.displayName = 'proto.cosmos.vesting.v1beta1.Period';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.vesting.v1beta1.Period.repeatedFields_ = [2];



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
proto.cosmos.vesting.v1beta1.Period.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.vesting.v1beta1.Period.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.vesting.v1beta1.Period} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.vesting.v1beta1.Period.toObject = function(includeInstance, msg) {
  var f, obj = {
    length: jspb.Message.getFieldWithDefault(msg, 1, 0),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.cosmos.vesting.v1beta1.Period}
 */
proto.cosmos.vesting.v1beta1.Period.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.vesting.v1beta1.Period;
  return proto.cosmos.vesting.v1beta1.Period.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.vesting.v1beta1.Period} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.vesting.v1beta1.Period}
 */
proto.cosmos.vesting.v1beta1.Period.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLength(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
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
proto.cosmos.vesting.v1beta1.Period.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.vesting.v1beta1.Period.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.vesting.v1beta1.Period} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.vesting.v1beta1.Period.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLength();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 length = 1;
 * @return {number}
 */
proto.cosmos.vesting.v1beta1.Period.prototype.getLength = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.vesting.v1beta1.Period} returns this
 */
proto.cosmos.vesting.v1beta1.Period.prototype.setLength = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.cosmos.vesting.v1beta1.Period.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.cosmos.vesting.v1beta1.Period} returns this
*/
proto.cosmos.vesting.v1beta1.Period.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmos.vesting.v1beta1.Period.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.vesting.v1beta1.Period} returns this
 */
proto.cosmos.vesting.v1beta1.Period.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


