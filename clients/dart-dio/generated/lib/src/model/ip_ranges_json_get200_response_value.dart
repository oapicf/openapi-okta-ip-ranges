//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ip_ranges_json_get200_response_value.g.dart';

/// Object containing IP ranges for a specific regional cell
///
/// Properties:
/// * [ipRanges] 
@BuiltValue()
abstract class IpRangesJsonGet200ResponseValue implements Built<IpRangesJsonGet200ResponseValue, IpRangesJsonGet200ResponseValueBuilder> {
  @BuiltValueField(wireName: r'ip_ranges')
  BuiltList<String>? get ipRanges;

  IpRangesJsonGet200ResponseValue._();

  factory IpRangesJsonGet200ResponseValue([void updates(IpRangesJsonGet200ResponseValueBuilder b)]) = _$IpRangesJsonGet200ResponseValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IpRangesJsonGet200ResponseValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IpRangesJsonGet200ResponseValue> get serializer => _$IpRangesJsonGet200ResponseValueSerializer();
}

class _$IpRangesJsonGet200ResponseValueSerializer implements PrimitiveSerializer<IpRangesJsonGet200ResponseValue> {
  @override
  final Iterable<Type> types = const [IpRangesJsonGet200ResponseValue, _$IpRangesJsonGet200ResponseValue];

  @override
  final String wireName = r'IpRangesJsonGet200ResponseValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IpRangesJsonGet200ResponseValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ipRanges != null) {
      yield r'ip_ranges';
      yield serializers.serialize(
        object.ipRanges,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IpRangesJsonGet200ResponseValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IpRangesJsonGet200ResponseValueBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ip_ranges':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.ipRanges.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IpRangesJsonGet200ResponseValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IpRangesJsonGet200ResponseValueBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

