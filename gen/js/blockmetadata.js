// source: cosmos/base/store/v1beta1/listening.proto
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

goog.provide('proto.cosmos.base.store.v1beta1.BlockMetadata');
goog.provide('proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.abci.RequestBeginBlock');
goog.require('proto.tendermint.abci.RequestDeliverTx');
goog.require('proto.tendermint.abci.RequestEndBlock');
goog.require('proto.tendermint.abci.ResponseBeginBlock');
goog.require('proto.tendermint.abci.ResponseCommit');
goog.require('proto.tendermint.abci.ResponseDeliverTx');
goog.require('proto.tendermint.abci.ResponseEndBlock');

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
proto.cosmos.base.store.v1beta1.BlockMetadata = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.base.store.v1beta1.BlockMetadata.repeatedFields_, null);
};
goog.inherits(proto.cosmos.base.store.v1beta1.BlockMetadata, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.store.v1beta1.BlockMetadata.displayName = 'proto.cosmos.base.store.v1beta1.BlockMetadata';
}
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
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.displayName = 'proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.repeatedFields_ = [3];



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
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.store.v1beta1.BlockMetadata.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestBeginBlock: (f = msg.getRequestBeginBlock()) && proto.tendermint.abci.RequestBeginBlock.toObject(includeInstance, f),
    responseBeginBlock: (f = msg.getResponseBeginBlock()) && proto.tendermint.abci.ResponseBeginBlock.toObject(includeInstance, f),
    deliverTxsList: jspb.Message.toObjectList(msg.getDeliverTxsList(),
    proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.toObject, includeInstance),
    requestEndBlock: (f = msg.getRequestEndBlock()) && proto.tendermint.abci.RequestEndBlock.toObject(includeInstance, f),
    responseEndBlock: (f = msg.getResponseEndBlock()) && proto.tendermint.abci.ResponseEndBlock.toObject(includeInstance, f),
    responseCommit: (f = msg.getResponseCommit()) && proto.tendermint.abci.ResponseCommit.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.store.v1beta1.BlockMetadata;
  return proto.cosmos.base.store.v1beta1.BlockMetadata.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.RequestBeginBlock;
      reader.readMessage(value,proto.tendermint.abci.RequestBeginBlock.deserializeBinaryFromReader);
      msg.setRequestBeginBlock(value);
      break;
    case 2:
      var value = new proto.tendermint.abci.ResponseBeginBlock;
      reader.readMessage(value,proto.tendermint.abci.ResponseBeginBlock.deserializeBinaryFromReader);
      msg.setResponseBeginBlock(value);
      break;
    case 3:
      var value = new proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx;
      reader.readMessage(value,proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.deserializeBinaryFromReader);
      msg.addDeliverTxs(value);
      break;
    case 4:
      var value = new proto.tendermint.abci.RequestEndBlock;
      reader.readMessage(value,proto.tendermint.abci.RequestEndBlock.deserializeBinaryFromReader);
      msg.setRequestEndBlock(value);
      break;
    case 5:
      var value = new proto.tendermint.abci.ResponseEndBlock;
      reader.readMessage(value,proto.tendermint.abci.ResponseEndBlock.deserializeBinaryFromReader);
      msg.setResponseEndBlock(value);
      break;
    case 6:
      var value = new proto.tendermint.abci.ResponseCommit;
      reader.readMessage(value,proto.tendermint.abci.ResponseCommit.deserializeBinaryFromReader);
      msg.setResponseCommit(value);
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
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.store.v1beta1.BlockMetadata.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestBeginBlock();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.abci.RequestBeginBlock.serializeBinaryToWriter
    );
  }
  f = message.getResponseBeginBlock();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.abci.ResponseBeginBlock.serializeBinaryToWriter
    );
  }
  f = message.getDeliverTxsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.serializeBinaryToWriter
    );
  }
  f = message.getRequestEndBlock();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.abci.RequestEndBlock.serializeBinaryToWriter
    );
  }
  f = message.getResponseEndBlock();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.tendermint.abci.ResponseEndBlock.serializeBinaryToWriter
    );
  }
  f = message.getResponseCommit();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.tendermint.abci.ResponseCommit.serializeBinaryToWriter
    );
  }
};





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
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    request: (f = msg.getRequest()) && proto.tendermint.abci.RequestDeliverTx.toObject(includeInstance, f),
    response: (f = msg.getResponse()) && proto.tendermint.abci.ResponseDeliverTx.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx;
  return proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.RequestDeliverTx;
      reader.readMessage(value,proto.tendermint.abci.RequestDeliverTx.deserializeBinaryFromReader);
      msg.setRequest(value);
      break;
    case 2:
      var value = new proto.tendermint.abci.ResponseDeliverTx;
      reader.readMessage(value,proto.tendermint.abci.ResponseDeliverTx.deserializeBinaryFromReader);
      msg.setResponse(value);
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
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.abci.RequestDeliverTx.serializeBinaryToWriter
    );
  }
  f = message.getResponse();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.abci.ResponseDeliverTx.serializeBinaryToWriter
    );
  }
};


/**
 * optional tendermint.abci.RequestDeliverTx request = 1;
 * @return {?proto.tendermint.abci.RequestDeliverTx}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.getRequest = function() {
  return /** @type{?proto.tendermint.abci.RequestDeliverTx} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.RequestDeliverTx, 1));
};


/**
 * @param {?proto.tendermint.abci.RequestDeliverTx|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional tendermint.abci.ResponseDeliverTx response = 2;
 * @return {?proto.tendermint.abci.ResponseDeliverTx}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.getResponse = function() {
  return /** @type{?proto.tendermint.abci.ResponseDeliverTx} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseDeliverTx, 2));
};


/**
 * @param {?proto.tendermint.abci.ResponseDeliverTx|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.setResponse = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.clearResponse = function() {
  return this.setResponse(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx.prototype.hasResponse = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional tendermint.abci.RequestBeginBlock request_begin_block = 1;
 * @return {?proto.tendermint.abci.RequestBeginBlock}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getRequestBeginBlock = function() {
  return /** @type{?proto.tendermint.abci.RequestBeginBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.RequestBeginBlock, 1));
};


/**
 * @param {?proto.tendermint.abci.RequestBeginBlock|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setRequestBeginBlock = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearRequestBeginBlock = function() {
  return this.setRequestBeginBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.hasRequestBeginBlock = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional tendermint.abci.ResponseBeginBlock response_begin_block = 2;
 * @return {?proto.tendermint.abci.ResponseBeginBlock}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getResponseBeginBlock = function() {
  return /** @type{?proto.tendermint.abci.ResponseBeginBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseBeginBlock, 2));
};


/**
 * @param {?proto.tendermint.abci.ResponseBeginBlock|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setResponseBeginBlock = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearResponseBeginBlock = function() {
  return this.setResponseBeginBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.hasResponseBeginBlock = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated DeliverTx deliver_txs = 3;
 * @return {!Array<!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx>}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getDeliverTxsList = function() {
  return /** @type{!Array<!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx>} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setDeliverTxsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.addDeliverTxs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearDeliverTxsList = function() {
  return this.setDeliverTxsList([]);
};


/**
 * optional tendermint.abci.RequestEndBlock request_end_block = 4;
 * @return {?proto.tendermint.abci.RequestEndBlock}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getRequestEndBlock = function() {
  return /** @type{?proto.tendermint.abci.RequestEndBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.RequestEndBlock, 4));
};


/**
 * @param {?proto.tendermint.abci.RequestEndBlock|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setRequestEndBlock = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearRequestEndBlock = function() {
  return this.setRequestEndBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.hasRequestEndBlock = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional tendermint.abci.ResponseEndBlock response_end_block = 5;
 * @return {?proto.tendermint.abci.ResponseEndBlock}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getResponseEndBlock = function() {
  return /** @type{?proto.tendermint.abci.ResponseEndBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseEndBlock, 5));
};


/**
 * @param {?proto.tendermint.abci.ResponseEndBlock|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setResponseEndBlock = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearResponseEndBlock = function() {
  return this.setResponseEndBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.hasResponseEndBlock = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional tendermint.abci.ResponseCommit response_commit = 6;
 * @return {?proto.tendermint.abci.ResponseCommit}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.getResponseCommit = function() {
  return /** @type{?proto.tendermint.abci.ResponseCommit} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseCommit, 6));
};


/**
 * @param {?proto.tendermint.abci.ResponseCommit|undefined} value
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
*/
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.setResponseCommit = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.store.v1beta1.BlockMetadata} returns this
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.clearResponseCommit = function() {
  return this.setResponseCommit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.store.v1beta1.BlockMetadata.prototype.hasResponseCommit = function() {
  return jspb.Message.getField(this, 6) != null;
};


