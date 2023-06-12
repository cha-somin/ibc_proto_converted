# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from secret.compute.v1beta1 import msg_pb2 as secret_dot_compute_dot_v1beta1_dot_msg__pb2


class MsgStub(object):
    """Msg defines the wasm Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.StoreCode = channel.unary_unary(
                '/secret.compute.v1beta1.Msg/StoreCode',
                request_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCode.SerializeToString,
                response_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCodeResponse.FromString,
                )
        self.InstantiateContract = channel.unary_unary(
                '/secret.compute.v1beta1.Msg/InstantiateContract',
                request_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContract.SerializeToString,
                response_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContractResponse.FromString,
                )
        self.ExecuteContract = channel.unary_unary(
                '/secret.compute.v1beta1.Msg/ExecuteContract',
                request_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContract.SerializeToString,
                response_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContractResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the wasm Msg service.
    """

    def StoreCode(self, request, context):
        """StoreCode to submit Wasm code to the system
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def InstantiateContract(self, request, context):
        """Instantiate creates a new smart contract instance for the given code id.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ExecuteContract(self, request, context):
        """Execute submits the given message data to a smart contract
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'StoreCode': grpc.unary_unary_rpc_method_handler(
                    servicer.StoreCode,
                    request_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCode.FromString,
                    response_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCodeResponse.SerializeToString,
            ),
            'InstantiateContract': grpc.unary_unary_rpc_method_handler(
                    servicer.InstantiateContract,
                    request_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContract.FromString,
                    response_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContractResponse.SerializeToString,
            ),
            'ExecuteContract': grpc.unary_unary_rpc_method_handler(
                    servicer.ExecuteContract,
                    request_deserializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContract.FromString,
                    response_serializer=secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContractResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'secret.compute.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the wasm Msg service.
    """

    @staticmethod
    def StoreCode(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/secret.compute.v1beta1.Msg/StoreCode',
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCode.SerializeToString,
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgStoreCodeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def InstantiateContract(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/secret.compute.v1beta1.Msg/InstantiateContract',
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContract.SerializeToString,
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgInstantiateContractResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ExecuteContract(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/secret.compute.v1beta1.Msg/ExecuteContract',
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContract.SerializeToString,
            secret_dot_compute_dot_v1beta1_dot_msg__pb2.MsgExecuteContractResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
