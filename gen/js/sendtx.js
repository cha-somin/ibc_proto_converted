// source: shentu/burrow/payload.proto
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

goog.provide('proto.payload.SendTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.payload.TxInput');
goog.require('proto.payload.TxOutput');

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
proto.payload.SendTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.payload.SendTx.repeatedFields_, null);
};
goog.inherits(proto.payload.SendTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.payload.SendTx.displayName = 'proto.payload.SendTx';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.payload.SendTx.repeatedFields_ = [1,2];



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
proto.payload.SendTx.prototype.toObject = function(opt_includeInstance) {
  return proto.payload.SendTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.payload.SendTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.SendTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    inputsList: jspb.Message.toObjectList(msg.getInputsList(),
    proto.payload.TxInput.toObject, includeInstance),
    outputsList: jspb.Message.toObjectList(msg.getOutputsList(),
    proto.payload.TxOutput.toObject, includeInstance)
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
 * @return {!proto.payload.SendTx}
 */
proto.payload.SendTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.payload.SendTx;
  return proto.payload.SendTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.payload.SendTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.payload.SendTx}
 */
proto.payload.SendTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.payload.TxInput;
      reader.readMessage(value,proto.payload.TxInput.deserializeBinaryFromReader);
      msg.addInputs(value);
      break;
    case 2:
      var value = new proto.payload.TxOutput;
      reader.readMessage(value,proto.payload.TxOutput.deserializeBinaryFromReader);
      msg.addOutputs(value);
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
proto.payload.SendTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.payload.SendTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.payload.SendTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.SendTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInputsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.payload.TxInput.serializeBinaryToWriter
    );
  }
  f = message.getOutputsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.payload.TxOutput.serializeBinaryToWriter
    );
  }
};


/**
 * repeated TxInput Inputs = 1;
 * @return {!Array<!proto.payload.TxInput>}
 */
proto.payload.SendTx.prototype.getInputsList = function() {
  return /** @type{!Array<!proto.payload.TxInput>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.payload.TxInput, 1));
};


/**
 * @param {!Array<!proto.payload.TxInput>} value
 * @return {!proto.payload.SendTx} returns this
*/
proto.payload.SendTx.prototype.setInputsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.payload.TxInput=} opt_value
 * @param {number=} opt_index
 * @return {!proto.payload.TxInput}
 */
proto.payload.SendTx.prototype.addInputs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.payload.TxInput, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.payload.SendTx} returns this
 */
proto.payload.SendTx.prototype.clearInputsList = function() {
  return this.setInputsList([]);
};


/**
 * repeated TxOutput Outputs = 2;
 * @return {!Array<!proto.payload.TxOutput>}
 */
proto.payload.SendTx.prototype.getOutputsList = function() {
  return /** @type{!Array<!proto.payload.TxOutput>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.payload.TxOutput, 2));
};


/**
 * @param {!Array<!proto.payload.TxOutput>} value
 * @return {!proto.payload.SendTx} returns this
*/
proto.payload.SendTx.prototype.setOutputsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.payload.TxOutput=} opt_value
 * @param {number=} opt_index
 * @return {!proto.payload.TxOutput}
 */
proto.payload.SendTx.prototype.addOutputs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.payload.TxOutput, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.payload.SendTx} returns this
 */
proto.payload.SendTx.prototype.clearOutputsList = function() {
  return this.setOutputsList([]);
};


