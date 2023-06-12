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

goog.provide('proto.axelar.evm.v1beta1.BatchedCommandsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.evm.v1beta1.Proof');

goog.forwardDeclare('proto.axelar.evm.v1beta1.BatchedCommandsStatus');
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
proto.axelar.evm.v1beta1.BatchedCommandsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.BatchedCommandsResponse.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.BatchedCommandsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.BatchedCommandsResponse.displayName = 'proto.axelar.evm.v1beta1.BatchedCommandsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.repeatedFields_ = [8];



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
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.BatchedCommandsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    data: jspb.Message.getFieldWithDefault(msg, 2, ""),
    status: jspb.Message.getFieldWithDefault(msg, 3, 0),
    keyId: jspb.Message.getFieldWithDefault(msg, 4, ""),
    executeData: jspb.Message.getFieldWithDefault(msg, 6, ""),
    prevBatchedCommandsId: jspb.Message.getFieldWithDefault(msg, 7, ""),
    commandIdsList: (f = jspb.Message.getRepeatedField(msg, 8)) == null ? undefined : f,
    proof: (f = msg.getProof()) && proto.axelar.evm.v1beta1.Proof.toObject(includeInstance, f)
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
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.BatchedCommandsResponse;
  return proto.axelar.evm.v1beta1.BatchedCommandsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
      break;
    case 3:
      var value = /** @type {!proto.axelar.evm.v1beta1.BatchedCommandsStatus} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setKeyId(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setExecuteData(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setPrevBatchedCommandsId(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.addCommandIds(value);
      break;
    case 9:
      var value = new proto.axelar.evm.v1beta1.Proof;
      reader.readMessage(value,proto.axelar.evm.v1beta1.Proof.deserializeBinaryFromReader);
      msg.setProof(value);
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
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.BatchedCommandsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getKeyId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getExecuteData();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getPrevBatchedCommandsId();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getCommandIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      8,
      f
    );
  }
  f = message.getProof();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.axelar.evm.v1beta1.Proof.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string data = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional BatchedCommandsStatus status = 3;
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsStatus}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getStatus = function() {
  return /** @type {!proto.axelar.evm.v1beta1.BatchedCommandsStatus} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.axelar.evm.v1beta1.BatchedCommandsStatus} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional string key_id = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getKeyId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setKeyId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string execute_data = 6;
 * @return {string}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getExecuteData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setExecuteData = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string prev_batched_commands_id = 7;
 * @return {string}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getPrevBatchedCommandsId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setPrevBatchedCommandsId = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * repeated string command_ids = 8;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getCommandIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 8));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setCommandIdsList = function(value) {
  return jspb.Message.setField(this, 8, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.addCommandIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 8, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.clearCommandIdsList = function() {
  return this.setCommandIdsList([]);
};


/**
 * optional Proof proof = 9;
 * @return {?proto.axelar.evm.v1beta1.Proof}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.getProof = function() {
  return /** @type{?proto.axelar.evm.v1beta1.Proof} */ (
    jspb.Message.getWrapperField(this, proto.axelar.evm.v1beta1.Proof, 9));
};


/**
 * @param {?proto.axelar.evm.v1beta1.Proof|undefined} value
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
*/
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.setProof = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.BatchedCommandsResponse} returns this
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.clearProof = function() {
  return this.setProof(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.BatchedCommandsResponse.prototype.hasProof = function() {
  return jspb.Message.getField(this, 9) != null;
};


