// source: ixo/claims/v1beta1/authz.proto
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

goog.provide('proto.ixo.claims.v1beta1.WithdrawPaymentConstraints');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.ixo.claims.v1beta1.Contract1155Payment');
goog.require('proto.ixo.claims.v1beta1.Input');
goog.require('proto.ixo.claims.v1beta1.Output');

goog.forwardDeclare('proto.ixo.claims.v1beta1.PaymentType');
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
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.repeatedFields_, null);
};
goog.inherits(proto.ixo.claims.v1beta1.WithdrawPaymentConstraints, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.displayName = 'proto.ixo.claims.v1beta1.WithdrawPaymentConstraints';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.repeatedFields_ = [2,3];



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
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.toObject = function(includeInstance, msg) {
  var f, obj = {
    claimId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    inputsList: jspb.Message.toObjectList(msg.getInputsList(),
    proto.ixo.claims.v1beta1.Input.toObject, includeInstance),
    outputsList: jspb.Message.toObjectList(msg.getOutputsList(),
    proto.ixo.claims.v1beta1.Output.toObject, includeInstance),
    paymentType: jspb.Message.getFieldWithDefault(msg, 4, 0),
    contract1155Payment: (f = msg.getContract1155Payment()) && proto.ixo.claims.v1beta1.Contract1155Payment.toObject(includeInstance, f),
    toaddress: jspb.Message.getFieldWithDefault(msg, 6, ""),
    fromaddress: jspb.Message.getFieldWithDefault(msg, 7, ""),
    releaseDate: (f = msg.getReleaseDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.WithdrawPaymentConstraints;
  return proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClaimId(value);
      break;
    case 2:
      var value = new proto.ixo.claims.v1beta1.Input;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Input.deserializeBinaryFromReader);
      msg.addInputs(value);
      break;
    case 3:
      var value = new proto.ixo.claims.v1beta1.Output;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Output.deserializeBinaryFromReader);
      msg.addOutputs(value);
      break;
    case 4:
      var value = /** @type {!proto.ixo.claims.v1beta1.PaymentType} */ (reader.readEnum());
      msg.setPaymentType(value);
      break;
    case 5:
      var value = new proto.ixo.claims.v1beta1.Contract1155Payment;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Contract1155Payment.deserializeBinaryFromReader);
      msg.setContract1155Payment(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setToaddress(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromaddress(value);
      break;
    case 8:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setReleaseDate(value);
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
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClaimId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getInputsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ixo.claims.v1beta1.Input.serializeBinaryToWriter
    );
  }
  f = message.getOutputsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.ixo.claims.v1beta1.Output.serializeBinaryToWriter
    );
  }
  f = message.getPaymentType();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
  f = message.getContract1155Payment();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.ixo.claims.v1beta1.Contract1155Payment.serializeBinaryToWriter
    );
  }
  f = message.getToaddress();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getFromaddress();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getReleaseDate();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string claim_id = 1;
 * @return {string}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getClaimId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setClaimId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Input inputs = 2;
 * @return {!Array<!proto.ixo.claims.v1beta1.Input>}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getInputsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.Input>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.Input, 2));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.Input>} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
*/
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setInputsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.Input=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.Input}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.addInputs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ixo.claims.v1beta1.Input, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.clearInputsList = function() {
  return this.setInputsList([]);
};


/**
 * repeated Output outputs = 3;
 * @return {!Array<!proto.ixo.claims.v1beta1.Output>}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getOutputsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.Output>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.Output, 3));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.Output>} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
*/
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setOutputsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.Output=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.Output}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.addOutputs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.ixo.claims.v1beta1.Output, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.clearOutputsList = function() {
  return this.setOutputsList([]);
};


/**
 * optional PaymentType payment_type = 4;
 * @return {!proto.ixo.claims.v1beta1.PaymentType}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getPaymentType = function() {
  return /** @type {!proto.ixo.claims.v1beta1.PaymentType} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.ixo.claims.v1beta1.PaymentType} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setPaymentType = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


/**
 * optional Contract1155Payment contract_1155_payment = 5;
 * @return {?proto.ixo.claims.v1beta1.Contract1155Payment}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getContract1155Payment = function() {
  return /** @type{?proto.ixo.claims.v1beta1.Contract1155Payment} */ (
    jspb.Message.getWrapperField(this, proto.ixo.claims.v1beta1.Contract1155Payment, 5));
};


/**
 * @param {?proto.ixo.claims.v1beta1.Contract1155Payment|undefined} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
*/
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setContract1155Payment = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.clearContract1155Payment = function() {
  return this.setContract1155Payment(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.hasContract1155Payment = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string toAddress = 6;
 * @return {string}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getToaddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setToaddress = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string fromAddress = 7;
 * @return {string}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getFromaddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setFromaddress = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional google.protobuf.Timestamp release_date = 8;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.getReleaseDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 8));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
*/
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.setReleaseDate = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.clearReleaseDate = function() {
  return this.setReleaseDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.prototype.hasReleaseDate = function() {
  return jspb.Message.getField(this, 8) != null;
};


