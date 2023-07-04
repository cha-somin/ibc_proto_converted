# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from shentu.burrow import acm_pb2 as shentu_dot_burrow_dot_acm__pb2
from shentu.cvm.v1alpha1 import query_pb2 as shentu_dot_cvm_dot_v1alpha1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Code = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/Code',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeResponse.FromString,
                )
        self.Abi = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/Abi',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiResponse.FromString,
                )
        self.Storage = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/Storage',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageResponse.FromString,
                )
        self.AddressMeta = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/AddressMeta',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaResponse.FromString,
                )
        self.Meta = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/Meta',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaResponse.FromString,
                )
        self.Account = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/Account',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAccountRequest.SerializeToString,
                response_deserializer=shentu_dot_burrow_dot_acm__pb2.Account.FromString,
                )
        self.View = channel.unary_unary(
                '/shentu.cvm.v1alpha1.Query/View',
                request_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewRequest.SerializeToString,
                response_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Code(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Abi(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Storage(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddressMeta(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Meta(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Account(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def View(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Code': grpc.unary_unary_rpc_method_handler(
                    servicer.Code,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeResponse.SerializeToString,
            ),
            'Abi': grpc.unary_unary_rpc_method_handler(
                    servicer.Abi,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiResponse.SerializeToString,
            ),
            'Storage': grpc.unary_unary_rpc_method_handler(
                    servicer.Storage,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageResponse.SerializeToString,
            ),
            'AddressMeta': grpc.unary_unary_rpc_method_handler(
                    servicer.AddressMeta,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaResponse.SerializeToString,
            ),
            'Meta': grpc.unary_unary_rpc_method_handler(
                    servicer.Meta,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaResponse.SerializeToString,
            ),
            'Account': grpc.unary_unary_rpc_method_handler(
                    servicer.Account,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAccountRequest.FromString,
                    response_serializer=shentu_dot_burrow_dot_acm__pb2.Account.SerializeToString,
            ),
            'View': grpc.unary_unary_rpc_method_handler(
                    servicer.View,
                    request_deserializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewRequest.FromString,
                    response_serializer=shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'shentu.cvm.v1alpha1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Code(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/Code',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryCodeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Abi(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/Abi',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAbiResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Storage(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/Storage',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryStorageResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddressMeta(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/AddressMeta',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAddressMetaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Meta(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/Meta',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryMetaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Account(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/Account',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryAccountRequest.SerializeToString,
            shentu_dot_burrow_dot_acm__pb2.Account.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def View(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.cvm.v1alpha1.Query/View',
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewRequest.SerializeToString,
            shentu_dot_cvm_dot_v1alpha1_dot_query__pb2.QueryViewResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)