// source: akash/escrow/v1beta3/genesis.proto
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

goog.provide('proto.akash.escrow.v1beta3.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.escrow.v1beta3.Account');
goog.require('proto.akash.escrow.v1beta3.FractionalPayment');

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
proto.akash.escrow.v1beta3.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.escrow.v1beta3.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.akash.escrow.v1beta3.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.escrow.v1beta3.GenesisState.displayName = 'proto.akash.escrow.v1beta3.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.escrow.v1beta3.GenesisState.repeatedFields_ = [1,2];



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
proto.akash.escrow.v1beta3.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.escrow.v1beta3.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.escrow.v1beta3.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.escrow.v1beta3.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    accountsList: jspb.Message.toObjectList(msg.getAccountsList(),
    proto.akash.escrow.v1beta3.Account.toObject, includeInstance),
    paymentsList: jspb.Message.toObjectList(msg.getPaymentsList(),
    proto.akash.escrow.v1beta3.FractionalPayment.toObject, includeInstance)
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
 * @return {!proto.akash.escrow.v1beta3.GenesisState}
 */
proto.akash.escrow.v1beta3.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.escrow.v1beta3.GenesisState;
  return proto.akash.escrow.v1beta3.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.escrow.v1beta3.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.escrow.v1beta3.GenesisState}
 */
proto.akash.escrow.v1beta3.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.escrow.v1beta3.Account;
      reader.readMessage(value,proto.akash.escrow.v1beta3.Account.deserializeBinaryFromReader);
      msg.addAccounts(value);
      break;
    case 2:
      var value = new proto.akash.escrow.v1beta3.FractionalPayment;
      reader.readMessage(value,proto.akash.escrow.v1beta3.FractionalPayment.deserializeBinaryFromReader);
      msg.addPayments(value);
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
proto.akash.escrow.v1beta3.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.escrow.v1beta3.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.escrow.v1beta3.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.escrow.v1beta3.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.akash.escrow.v1beta3.Account.serializeBinaryToWriter
    );
  }
  f = message.getPaymentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.akash.escrow.v1beta3.FractionalPayment.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Account accounts = 1;
 * @return {!Array<!proto.akash.escrow.v1beta3.Account>}
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.getAccountsList = function() {
  return /** @type{!Array<!proto.akash.escrow.v1beta3.Account>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.escrow.v1beta3.Account, 1));
};


/**
 * @param {!Array<!proto.akash.escrow.v1beta3.Account>} value
 * @return {!proto.akash.escrow.v1beta3.GenesisState} returns this
*/
proto.akash.escrow.v1beta3.GenesisState.prototype.setAccountsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.akash.escrow.v1beta3.Account=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.escrow.v1beta3.Account}
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.addAccounts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.akash.escrow.v1beta3.Account, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.escrow.v1beta3.GenesisState} returns this
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.clearAccountsList = function() {
  return this.setAccountsList([]);
};


/**
 * repeated FractionalPayment payments = 2;
 * @return {!Array<!proto.akash.escrow.v1beta3.FractionalPayment>}
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.getPaymentsList = function() {
  return /** @type{!Array<!proto.akash.escrow.v1beta3.FractionalPayment>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.escrow.v1beta3.FractionalPayment, 2));
};


/**
 * @param {!Array<!proto.akash.escrow.v1beta3.FractionalPayment>} value
 * @return {!proto.akash.escrow.v1beta3.GenesisState} returns this
*/
proto.akash.escrow.v1beta3.GenesisState.prototype.setPaymentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.akash.escrow.v1beta3.FractionalPayment=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.escrow.v1beta3.FractionalPayment}
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.addPayments = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.akash.escrow.v1beta3.FractionalPayment, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.escrow.v1beta3.GenesisState} returns this
 */
proto.akash.escrow.v1beta3.GenesisState.prototype.clearPaymentsList = function() {
  return this.setPaymentsList([]);
};


