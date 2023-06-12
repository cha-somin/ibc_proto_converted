// source: ixo/token/v1beta1/authz.proto
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

goog.provide('proto.ixo.token.v1beta1.MintConstraints');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.token.v1beta1.TokenData');

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
proto.ixo.token.v1beta1.MintConstraints = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.token.v1beta1.MintConstraints.repeatedFields_, null);
};
goog.inherits(proto.ixo.token.v1beta1.MintConstraints, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.token.v1beta1.MintConstraints.displayName = 'proto.ixo.token.v1beta1.MintConstraints';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.token.v1beta1.MintConstraints.repeatedFields_ = [6];



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
proto.ixo.token.v1beta1.MintConstraints.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.token.v1beta1.MintConstraints.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.token.v1beta1.MintConstraints} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.MintConstraints.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 2, ""),
    name: jspb.Message.getFieldWithDefault(msg, 3, ""),
    index: jspb.Message.getFieldWithDefault(msg, 4, ""),
    collection: jspb.Message.getFieldWithDefault(msg, 5, ""),
    tokendataList: jspb.Message.toObjectList(msg.getTokendataList(),
    proto.ixo.token.v1beta1.TokenData.toObject, includeInstance)
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
 * @return {!proto.ixo.token.v1beta1.MintConstraints}
 */
proto.ixo.token.v1beta1.MintConstraints.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.token.v1beta1.MintConstraints;
  return proto.ixo.token.v1beta1.MintConstraints.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.token.v1beta1.MintConstraints} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.token.v1beta1.MintConstraints}
 */
proto.ixo.token.v1beta1.MintConstraints.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setIndex(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollection(value);
      break;
    case 6:
      var value = new proto.ixo.token.v1beta1.TokenData;
      reader.readMessage(value,proto.ixo.token.v1beta1.TokenData.deserializeBinaryFromReader);
      msg.addTokendata(value);
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
proto.ixo.token.v1beta1.MintConstraints.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.token.v1beta1.MintConstraints.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.token.v1beta1.MintConstraints} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.MintConstraints.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getIndex();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCollection();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTokendataList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.ixo.token.v1beta1.TokenData.serializeBinaryToWriter
    );
  }
};


/**
 * optional string contract_address = 1;
 * @return {string}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string amount = 2;
 * @return {string}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string name = 3;
 * @return {string}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string index = 4;
 * @return {string}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getIndex = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.setIndex = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string collection = 5;
 * @return {string}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getCollection = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.setCollection = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * repeated TokenData tokenData = 6;
 * @return {!Array<!proto.ixo.token.v1beta1.TokenData>}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.getTokendataList = function() {
  return /** @type{!Array<!proto.ixo.token.v1beta1.TokenData>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.token.v1beta1.TokenData, 6));
};


/**
 * @param {!Array<!proto.ixo.token.v1beta1.TokenData>} value
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
*/
proto.ixo.token.v1beta1.MintConstraints.prototype.setTokendataList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.ixo.token.v1beta1.TokenData=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.token.v1beta1.TokenData}
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.addTokendata = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.ixo.token.v1beta1.TokenData, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.token.v1beta1.MintConstraints} returns this
 */
proto.ixo.token.v1beta1.MintConstraints.prototype.clearTokendataList = function() {
  return this.setTokendataList([]);
};


