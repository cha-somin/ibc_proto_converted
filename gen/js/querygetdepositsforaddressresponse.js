// source: lum-network/dfract/query.proto
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

goog.provide('proto.lum.network.dfract.QueryGetDepositsForAddressResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.lum.network.dfract.Deposit');

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
proto.lum.network.dfract.QueryGetDepositsForAddressResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.dfract.QueryGetDepositsForAddressResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.dfract.QueryGetDepositsForAddressResponse.displayName = 'proto.lum.network.dfract.QueryGetDepositsForAddressResponse';
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
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.dfract.QueryGetDepositsForAddressResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositsPendingWithdrawal: (f = msg.getDepositsPendingWithdrawal()) && proto.lum.network.dfract.Deposit.toObject(includeInstance, f),
    depositsPendingMint: (f = msg.getDepositsPendingMint()) && proto.lum.network.dfract.Deposit.toObject(includeInstance, f),
    depositsMinted: (f = msg.getDepositsMinted()) && proto.lum.network.dfract.Deposit.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.dfract.QueryGetDepositsForAddressResponse;
  return proto.lum.network.dfract.QueryGetDepositsForAddressResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.lum.network.dfract.Deposit;
      reader.readMessage(value,proto.lum.network.dfract.Deposit.deserializeBinaryFromReader);
      msg.setDepositsPendingWithdrawal(value);
      break;
    case 2:
      var value = new proto.lum.network.dfract.Deposit;
      reader.readMessage(value,proto.lum.network.dfract.Deposit.deserializeBinaryFromReader);
      msg.setDepositsPendingMint(value);
      break;
    case 3:
      var value = new proto.lum.network.dfract.Deposit;
      reader.readMessage(value,proto.lum.network.dfract.Deposit.deserializeBinaryFromReader);
      msg.setDepositsMinted(value);
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
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.dfract.QueryGetDepositsForAddressResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositsPendingWithdrawal();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.lum.network.dfract.Deposit.serializeBinaryToWriter
    );
  }
  f = message.getDepositsPendingMint();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.lum.network.dfract.Deposit.serializeBinaryToWriter
    );
  }
  f = message.getDepositsMinted();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.lum.network.dfract.Deposit.serializeBinaryToWriter
    );
  }
};


/**
 * optional Deposit deposits_pending_withdrawal = 1;
 * @return {?proto.lum.network.dfract.Deposit}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.getDepositsPendingWithdrawal = function() {
  return /** @type{?proto.lum.network.dfract.Deposit} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.dfract.Deposit, 1));
};


/**
 * @param {?proto.lum.network.dfract.Deposit|undefined} value
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
*/
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.setDepositsPendingWithdrawal = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.clearDepositsPendingWithdrawal = function() {
  return this.setDepositsPendingWithdrawal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.hasDepositsPendingWithdrawal = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Deposit deposits_pending_mint = 2;
 * @return {?proto.lum.network.dfract.Deposit}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.getDepositsPendingMint = function() {
  return /** @type{?proto.lum.network.dfract.Deposit} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.dfract.Deposit, 2));
};


/**
 * @param {?proto.lum.network.dfract.Deposit|undefined} value
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
*/
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.setDepositsPendingMint = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.clearDepositsPendingMint = function() {
  return this.setDepositsPendingMint(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.hasDepositsPendingMint = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Deposit deposits_minted = 3;
 * @return {?proto.lum.network.dfract.Deposit}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.getDepositsMinted = function() {
  return /** @type{?proto.lum.network.dfract.Deposit} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.dfract.Deposit, 3));
};


/**
 * @param {?proto.lum.network.dfract.Deposit|undefined} value
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
*/
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.setDepositsMinted = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.dfract.QueryGetDepositsForAddressResponse} returns this
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.clearDepositsMinted = function() {
  return this.setDepositsMinted(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.dfract.QueryGetDepositsForAddressResponse.prototype.hasDepositsMinted = function() {
  return jspb.Message.getField(this, 3) != null;
};


