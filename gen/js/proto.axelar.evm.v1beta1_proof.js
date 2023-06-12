// source: axelar/evm/v1beta1/query.proto
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

goog.provide('proto.axelar.evm.v1beta1.Proof');

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
proto.axelar.evm.v1beta1.Proof = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.Proof.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.Proof, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.Proof.displayName = 'proto.axelar.evm.v1beta1.Proof';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.Proof.repeatedFields_ = [1,2,4];



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
proto.axelar.evm.v1beta1.Proof.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.Proof.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.Proof} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.Proof.toObject = function(includeInstance, msg) {
  var f, obj = {
    addressesList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    weightsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    threshold: jspb.Message.getFieldWithDefault(msg, 3, ""),
    signaturesList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f
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
 * @return {!proto.axelar.evm.v1beta1.Proof}
 */
proto.axelar.evm.v1beta1.Proof.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.Proof;
  return proto.axelar.evm.v1beta1.Proof.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.Proof} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.Proof}
 */
proto.axelar.evm.v1beta1.Proof.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addAddresses(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addWeights(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setThreshold(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addSignatures(value);
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
proto.axelar.evm.v1beta1.Proof.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.Proof.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.Proof} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.Proof.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getWeightsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getThreshold();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSignaturesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
};


/**
 * repeated string addresses = 1;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.Proof.prototype.getAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.setAddressesList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.addAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.clearAddressesList = function() {
  return this.setAddressesList([]);
};


/**
 * repeated string weights = 2;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.Proof.prototype.getWeightsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.setWeightsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.addWeights = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.clearWeightsList = function() {
  return this.setWeightsList([]);
};


/**
 * optional string threshold = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.Proof.prototype.getThreshold = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.setThreshold = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated string signatures = 4;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.Proof.prototype.getSignaturesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.setSignaturesList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.addSignatures = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.Proof} returns this
 */
proto.axelar.evm.v1beta1.Proof.prototype.clearSignaturesList = function() {
  return this.setSignaturesList([]);
};


