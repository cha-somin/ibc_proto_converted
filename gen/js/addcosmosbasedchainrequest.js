// source: axelar/axelarnet/v1beta1/tx.proto
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

goog.provide('proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.exported.v1beta1.Asset');
goog.require('proto.axelar.nexus.exported.v1beta1.Chain');

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
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.repeatedFields_, null);
};
goog.inherits(proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.displayName = 'proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.repeatedFields_ = [5];



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
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    chain: (f = msg.getChain()) && proto.axelar.nexus.exported.v1beta1.Chain.toObject(includeInstance, f),
    addrPrefix: jspb.Message.getFieldWithDefault(msg, 3, ""),
    nativeAssetsList: jspb.Message.toObjectList(msg.getNativeAssetsList(),
    proto.axelar.nexus.exported.v1beta1.Asset.toObject, includeInstance),
    cosmosChain: jspb.Message.getFieldWithDefault(msg, 6, ""),
    ibcPath: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest;
  return proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.axelar.nexus.exported.v1beta1.Chain;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.Chain.deserializeBinaryFromReader);
      msg.setChain(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddrPrefix(value);
      break;
    case 5:
      var value = new proto.axelar.nexus.exported.v1beta1.Asset;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.Asset.deserializeBinaryFromReader);
      msg.addNativeAssets(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setCosmosChain(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setIbcPath(value);
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
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getChain();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.nexus.exported.v1beta1.Chain.serializeBinaryToWriter
    );
  }
  f = message.getAddrPrefix();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNativeAssetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.axelar.nexus.exported.v1beta1.Asset.serializeBinaryToWriter
    );
  }
  f = message.getCosmosChain();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getIbcPath();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getSender_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSender()));
};


/**
 * optional bytes sender = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSender()`
 * @return {!Uint8Array}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional axelar.nexus.exported.v1beta1.Chain chain = 2;
 * @return {?proto.axelar.nexus.exported.v1beta1.Chain}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getChain = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.Chain} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.Chain, 2));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.Chain|undefined} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
*/
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setChain = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.clearChain = function() {
  return this.setChain(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.hasChain = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string addr_prefix = 3;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getAddrPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setAddrPrefix = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated axelar.nexus.exported.v1beta1.Asset native_assets = 5;
 * @return {!Array<!proto.axelar.nexus.exported.v1beta1.Asset>}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getNativeAssetsList = function() {
  return /** @type{!Array<!proto.axelar.nexus.exported.v1beta1.Asset>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.nexus.exported.v1beta1.Asset, 5));
};


/**
 * @param {!Array<!proto.axelar.nexus.exported.v1beta1.Asset>} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
*/
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setNativeAssetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.axelar.nexus.exported.v1beta1.Asset=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.nexus.exported.v1beta1.Asset}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.addNativeAssets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.axelar.nexus.exported.v1beta1.Asset, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.clearNativeAssetsList = function() {
  return this.setNativeAssetsList([]);
};


/**
 * optional string cosmos_chain = 6;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getCosmosChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setCosmosChain = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string ibc_path = 7;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.getIbcPath = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest} returns this
 */
proto.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.prototype.setIbcPath = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


