// source: cosmwasm/wasm/v1/genesis.proto
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

goog.provide('proto.cosmwasm.wasm.v1.GenesisState');
goog.provide('proto.cosmwasm.wasm.v1.GenesisState.GenMsgs');
goog.provide('proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.SumCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmwasm.wasm.v1.Code');
goog.require('proto.cosmwasm.wasm.v1.Contract');
goog.require('proto.cosmwasm.wasm.v1.MsgExecuteContract');
goog.require('proto.cosmwasm.wasm.v1.MsgInstantiateContract');
goog.require('proto.cosmwasm.wasm.v1.MsgStoreCode');
goog.require('proto.cosmwasm.wasm.v1.Params');
goog.require('proto.cosmwasm.wasm.v1.Sequence');

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
proto.cosmwasm.wasm.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmwasm.wasm.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.cosmwasm.wasm.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmwasm.wasm.v1.GenesisState.displayName = 'proto.cosmwasm.wasm.v1.GenesisState';
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
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_);
};
goog.inherits(proto.cosmwasm.wasm.v1.GenesisState.GenMsgs, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.displayName = 'proto.cosmwasm.wasm.v1.GenesisState.GenMsgs';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmwasm.wasm.v1.GenesisState.repeatedFields_ = [2,3,4,5];



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
proto.cosmwasm.wasm.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmwasm.wasm.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmwasm.wasm.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.cosmwasm.wasm.v1.Params.toObject(includeInstance, f),
    codesList: jspb.Message.toObjectList(msg.getCodesList(),
    proto.cosmwasm.wasm.v1.Code.toObject, includeInstance),
    contractsList: jspb.Message.toObjectList(msg.getContractsList(),
    proto.cosmwasm.wasm.v1.Contract.toObject, includeInstance),
    sequencesList: jspb.Message.toObjectList(msg.getSequencesList(),
    proto.cosmwasm.wasm.v1.Sequence.toObject, includeInstance),
    genMsgsList: jspb.Message.toObjectList(msg.getGenMsgsList(),
    proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.toObject, includeInstance)
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
 * @return {!proto.cosmwasm.wasm.v1.GenesisState}
 */
proto.cosmwasm.wasm.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmwasm.wasm.v1.GenesisState;
  return proto.cosmwasm.wasm.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmwasm.wasm.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState}
 */
proto.cosmwasm.wasm.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmwasm.wasm.v1.Params;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cosmwasm.wasm.v1.Code;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.Code.deserializeBinaryFromReader);
      msg.addCodes(value);
      break;
    case 3:
      var value = new proto.cosmwasm.wasm.v1.Contract;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.Contract.deserializeBinaryFromReader);
      msg.addContracts(value);
      break;
    case 4:
      var value = new proto.cosmwasm.wasm.v1.Sequence;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.Sequence.deserializeBinaryFromReader);
      msg.addSequences(value);
      break;
    case 5:
      var value = new proto.cosmwasm.wasm.v1.GenesisState.GenMsgs;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.deserializeBinaryFromReader);
      msg.addGenMsgs(value);
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
proto.cosmwasm.wasm.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmwasm.wasm.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmwasm.wasm.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmwasm.wasm.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getCodesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmwasm.wasm.v1.Code.serializeBinaryToWriter
    );
  }
  f = message.getContractsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmwasm.wasm.v1.Contract.serializeBinaryToWriter
    );
  }
  f = message.getSequencesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmwasm.wasm.v1.Sequence.serializeBinaryToWriter
    );
  }
  f = message.getGenMsgsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.serializeBinaryToWriter
    );
  }
};



/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_ = [[1,2,3]];

/**
 * @enum {number}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.SumCase = {
  SUM_NOT_SET: 0,
  STORE_CODE: 1,
  INSTANTIATE_CONTRACT: 2,
  EXECUTE_CONTRACT: 3
};

/**
 * @return {proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.SumCase}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.getSumCase = function() {
  return /** @type {proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.SumCase} */(jspb.Message.computeOneofCase(this, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_[0]));
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
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.toObject = function(includeInstance, msg) {
  var f, obj = {
    storeCode: (f = msg.getStoreCode()) && proto.cosmwasm.wasm.v1.MsgStoreCode.toObject(includeInstance, f),
    instantiateContract: (f = msg.getInstantiateContract()) && proto.cosmwasm.wasm.v1.MsgInstantiateContract.toObject(includeInstance, f),
    executeContract: (f = msg.getExecuteContract()) && proto.cosmwasm.wasm.v1.MsgExecuteContract.toObject(includeInstance, f)
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
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmwasm.wasm.v1.GenesisState.GenMsgs;
  return proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmwasm.wasm.v1.MsgStoreCode;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.MsgStoreCode.deserializeBinaryFromReader);
      msg.setStoreCode(value);
      break;
    case 2:
      var value = new proto.cosmwasm.wasm.v1.MsgInstantiateContract;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.MsgInstantiateContract.deserializeBinaryFromReader);
      msg.setInstantiateContract(value);
      break;
    case 3:
      var value = new proto.cosmwasm.wasm.v1.MsgExecuteContract;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.MsgExecuteContract.deserializeBinaryFromReader);
      msg.setExecuteContract(value);
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
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStoreCode();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmwasm.wasm.v1.MsgStoreCode.serializeBinaryToWriter
    );
  }
  f = message.getInstantiateContract();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmwasm.wasm.v1.MsgInstantiateContract.serializeBinaryToWriter
    );
  }
  f = message.getExecuteContract();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmwasm.wasm.v1.MsgExecuteContract.serializeBinaryToWriter
    );
  }
};


/**
 * optional MsgStoreCode store_code = 1;
 * @return {?proto.cosmwasm.wasm.v1.MsgStoreCode}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.getStoreCode = function() {
  return /** @type{?proto.cosmwasm.wasm.v1.MsgStoreCode} */ (
    jspb.Message.getWrapperField(this, proto.cosmwasm.wasm.v1.MsgStoreCode, 1));
};


/**
 * @param {?proto.cosmwasm.wasm.v1.MsgStoreCode|undefined} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.setStoreCode = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.clearStoreCode = function() {
  return this.setStoreCode(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.hasStoreCode = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional MsgInstantiateContract instantiate_contract = 2;
 * @return {?proto.cosmwasm.wasm.v1.MsgInstantiateContract}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.getInstantiateContract = function() {
  return /** @type{?proto.cosmwasm.wasm.v1.MsgInstantiateContract} */ (
    jspb.Message.getWrapperField(this, proto.cosmwasm.wasm.v1.MsgInstantiateContract, 2));
};


/**
 * @param {?proto.cosmwasm.wasm.v1.MsgInstantiateContract|undefined} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.setInstantiateContract = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.clearInstantiateContract = function() {
  return this.setInstantiateContract(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.hasInstantiateContract = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional MsgExecuteContract execute_contract = 3;
 * @return {?proto.cosmwasm.wasm.v1.MsgExecuteContract}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.getExecuteContract = function() {
  return /** @type{?proto.cosmwasm.wasm.v1.MsgExecuteContract} */ (
    jspb.Message.getWrapperField(this, proto.cosmwasm.wasm.v1.MsgExecuteContract, 3));
};


/**
 * @param {?proto.cosmwasm.wasm.v1.MsgExecuteContract|undefined} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.setExecuteContract = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.clearExecuteContract = function() {
  return this.setExecuteContract(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmwasm.wasm.v1.GenesisState.GenMsgs.prototype.hasExecuteContract = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional Params params = 1;
 * @return {?proto.cosmwasm.wasm.v1.Params}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.cosmwasm.wasm.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.cosmwasm.wasm.v1.Params, 1));
};


/**
 * @param {?proto.cosmwasm.wasm.v1.Params|undefined} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Code codes = 2;
 * @return {!Array<!proto.cosmwasm.wasm.v1.Code>}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.getCodesList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.Code>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.Code, 2));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.Code>} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.prototype.setCodesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.Code=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.Code}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.addCodes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmwasm.wasm.v1.Code, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.clearCodesList = function() {
  return this.setCodesList([]);
};


/**
 * repeated Contract contracts = 3;
 * @return {!Array<!proto.cosmwasm.wasm.v1.Contract>}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.getContractsList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.Contract>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.Contract, 3));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.Contract>} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.prototype.setContractsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.Contract=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.Contract}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.addContracts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmwasm.wasm.v1.Contract, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.clearContractsList = function() {
  return this.setContractsList([]);
};


/**
 * repeated Sequence sequences = 4;
 * @return {!Array<!proto.cosmwasm.wasm.v1.Sequence>}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.getSequencesList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.Sequence>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.Sequence, 4));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.Sequence>} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.prototype.setSequencesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.Sequence=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.Sequence}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.addSequences = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmwasm.wasm.v1.Sequence, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.clearSequencesList = function() {
  return this.setSequencesList([]);
};


/**
 * repeated GenMsgs gen_msgs = 5;
 * @return {!Array<!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs>}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.getGenMsgsList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs, 5));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs>} value
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
*/
proto.cosmwasm.wasm.v1.GenesisState.prototype.setGenMsgsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.GenesisState.GenMsgs}
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.addGenMsgs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmwasm.wasm.v1.GenesisState.GenMsgs, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.GenesisState} returns this
 */
proto.cosmwasm.wasm.v1.GenesisState.prototype.clearGenMsgsList = function() {
  return this.setGenMsgsList([]);
};


