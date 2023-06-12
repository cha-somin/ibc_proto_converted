// source: comdex/asset/v1beta1/app.proto
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

goog.provide('proto.comdex.asset.v1beta1.AppData');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.asset.v1beta1.MintGenesisToken');

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
proto.comdex.asset.v1beta1.AppData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.asset.v1beta1.AppData.repeatedFields_, null);
};
goog.inherits(proto.comdex.asset.v1beta1.AppData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.asset.v1beta1.AppData.displayName = 'proto.comdex.asset.v1beta1.AppData';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.asset.v1beta1.AppData.repeatedFields_ = [6];



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
proto.comdex.asset.v1beta1.AppData.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.asset.v1beta1.AppData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.asset.v1beta1.AppData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.AppData.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    shortName: jspb.Message.getFieldWithDefault(msg, 3, ""),
    minGovDeposit: jspb.Message.getFieldWithDefault(msg, 4, ""),
    govTimeInSeconds: jspb.Message.getFieldWithDefault(msg, 5, 0),
    genesisTokenList: jspb.Message.toObjectList(msg.getGenesisTokenList(),
    proto.comdex.asset.v1beta1.MintGenesisToken.toObject, includeInstance)
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
 * @return {!proto.comdex.asset.v1beta1.AppData}
 */
proto.comdex.asset.v1beta1.AppData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.asset.v1beta1.AppData;
  return proto.comdex.asset.v1beta1.AppData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.asset.v1beta1.AppData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.asset.v1beta1.AppData}
 */
proto.comdex.asset.v1beta1.AppData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setShortName(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinGovDeposit(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGovTimeInSeconds(value);
      break;
    case 6:
      var value = new proto.comdex.asset.v1beta1.MintGenesisToken;
      reader.readMessage(value,proto.comdex.asset.v1beta1.MintGenesisToken.deserializeBinaryFromReader);
      msg.addGenesisToken(value);
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
proto.comdex.asset.v1beta1.AppData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.asset.v1beta1.AppData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.asset.v1beta1.AppData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.AppData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getShortName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMinGovDeposit();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getGovTimeInSeconds();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getGenesisTokenList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.comdex.asset.v1beta1.MintGenesisToken.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string short_name = 3;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getShortName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.setShortName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string min_gov_deposit = 4;
 * @return {string}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getMinGovDeposit = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.setMinGovDeposit = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 gov_time_in_seconds = 5;
 * @return {number}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getGovTimeInSeconds = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.setGovTimeInSeconds = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated MintGenesisToken genesis_token = 6;
 * @return {!Array<!proto.comdex.asset.v1beta1.MintGenesisToken>}
 */
proto.comdex.asset.v1beta1.AppData.prototype.getGenesisTokenList = function() {
  return /** @type{!Array<!proto.comdex.asset.v1beta1.MintGenesisToken>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.asset.v1beta1.MintGenesisToken, 6));
};


/**
 * @param {!Array<!proto.comdex.asset.v1beta1.MintGenesisToken>} value
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
*/
proto.comdex.asset.v1beta1.AppData.prototype.setGenesisTokenList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.comdex.asset.v1beta1.MintGenesisToken=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.asset.v1beta1.MintGenesisToken}
 */
proto.comdex.asset.v1beta1.AppData.prototype.addGenesisToken = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.comdex.asset.v1beta1.MintGenesisToken, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.asset.v1beta1.AppData} returns this
 */
proto.comdex.asset.v1beta1.AppData.prototype.clearGenesisTokenList = function() {
  return this.setGenesisTokenList([]);
};


