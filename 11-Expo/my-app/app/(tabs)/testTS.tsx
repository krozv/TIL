// import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View } from "react-native";
import { WebView } from 'react-native-webview'

export default function Test() {
  return (
    <>
    <div>test</div>
    <View>
        <Text>React Native Web View</Text>
        <WebView
            source={{ uri: 'http://localhost:3000' }}
            style={{ flex: 1}}
        />
    </View>
    </>
  );
};

// const styles = StyleSheet.create({
//     container: {
//         flex: 1,
//         backgroundColor: '#25292e',
//         alignItems: 'center',
//         justifyContent: 'center',
//     },
//     imageContainer: {
//         flex: 1,
//         paddingTop: 58,
//     }
// })

